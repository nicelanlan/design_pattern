package com.pattern.singleton;
/**
 * This will be thread-safe, but will load instance when the Class has been loaded.
 * It's not lazy loaded.
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    
    static public HungrySingleton getInstance() {
        return instance;
    }
}
