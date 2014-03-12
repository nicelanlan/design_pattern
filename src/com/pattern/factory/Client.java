package com.pattern.factory;

import java.util.List;

@SuppressWarnings({"all"})
public class Client {
    public static void main(String[] args) {
        createOne();
        createMulti();
    }
    
    public static Human createOne() {
        Human human = HumanFactory.createHuman(YellowHuman.class);
        return human;
    }
    
    public static void createMulti() {
        for(int i=0; i<1000; i++) {
            Human human = HumanFactory.createHuman();
        }
        
    }
}
