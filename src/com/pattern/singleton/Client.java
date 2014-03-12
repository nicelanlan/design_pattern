package com.pattern.singleton;

public class Client {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        for(int i=0; i<100000000; i++) {
            EnumSingleton instance = EnumSingleton.INSTANCE;
//            LazySingleton instance = LazySingleton.getInstance();
//            HungrySingleton instance = HungrySingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
