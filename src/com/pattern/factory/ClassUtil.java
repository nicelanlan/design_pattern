package com.pattern.factory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtil {
    //给一个接口，返回这个接口的所有实现类
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static List<Class> getAllClassByInterface(Class c) {
        List<Class> returnClassList = new ArrayList<Class>();
        //如果不是一个接口，则不做处理
        if(!c.isInterface()) {
            return returnClassList;
        }
        String packageName = c.getPackage().getName();//获得当前的包名
        try {
            List<Class> allClasses = getClasses(packageName);
            //判断是否是同一个接口
            for(Class cla : allClasses) {
                if(c.isAssignableFrom(cla)) {
                    if(!cla.equals(c)) {
                        returnClassList.add(cla);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnClassList;
    }
    
    //从一个包中查找出所有的类，在jar包中不能查找
    @SuppressWarnings("rawtypes")
    public static List<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while(resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        for(File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }
    
    @SuppressWarnings("rawtypes")
    public static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if(!directory.exists()) {
            return classes;
        } 
        File[] files = directory.listFiles();
        for(File file : files) {
            String fileName = file.getName();
            if(file.isDirectory()) {
                assert !fileName.contains(".");
                classes.addAll(findClasses(file, packageName + "." + fileName));
            } else if(fileName.endsWith(".class")) {
                classes.add(Class.forName(packageName + "." + fileName.substring(0, fileName.length()-6)));
            }
        }
        return classes;
    }
}
