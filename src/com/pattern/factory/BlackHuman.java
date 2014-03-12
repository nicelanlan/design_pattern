package com.pattern.factory;

public class BlackHuman implements Human {

    @Override
    public void cry() {
        System.out.println("yellow human cry");
    }

    @Override
    public void laugh() {
        System.out.println("yellow human laugh");
    }

    @Override
    public void talk() {
        System.out.println("yellow human talk");
    }

}
