package com.pattern.abstractfactory.factory;

import com.pattern.abstractfactory.human.Human;

@SuppressWarnings({"all"})
public abstract class AbstractHumanFactory implements HumanFactory {
    public Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
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
