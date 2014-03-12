package com.pattern.abstractfactory.factory;

import com.pattern.abstractfactory.human.Human;
import com.pattern.abstractfactory.human.MaleBlackHuman;
import com.pattern.abstractfactory.human.MaleWhiteHuman;
import com.pattern.abstractfactory.human.MaleYellowHuman;

public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createYellowHuman() {
        Human human = super.createHuman(MaleYellowHuman.class);
        return human;
    }

    @Override
    public Human createWhiteHuman() {
        Human human = super.createHuman(MaleWhiteHuman.class);
        return human;
    }

    @Override
    public Human createBlackHuman() {
        Human human = super.createHuman(MaleBlackHuman.class);
        return human;
    }

}
