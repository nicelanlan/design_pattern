package com.pattern.singleton;

/**
 * Lazy load instance, but this will be not thread-safe.
 */
public class LazySingleton {
    private static LazySingleton instance;
    
    public static LazySingleton getInstance() {
        if(null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
