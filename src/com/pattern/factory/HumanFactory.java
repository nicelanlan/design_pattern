package com.pattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@SuppressWarnings({ "all" })
public class HumanFactory {
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }

    public static Human createHuman() {
        Human human = null;
        List<Class> classes = ClassUtil.getAllClassByInterface(Human.class);
        Random random = new Random(classes.size());
        try {
            human = (Human) Class.forName(classes.get(random.nextInt()).getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }

    /**
     * 延迟初始化
     */
    //定义一个MAP,初始化过的Human对象都放在这里
    private static Map<String, Human> humans = new HashMap<String, Human>();

    public static Human createHumanForLazyInitialization(Class c) {
        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }
}
