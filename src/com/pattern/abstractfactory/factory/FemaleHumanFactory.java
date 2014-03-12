package com.pattern.abstractfactory.factory;

import com.pattern.abstractfactory.human.FemaleBlackHuman;
import com.pattern.abstractfactory.human.FemaleWhiteHuman;
import com.pattern.abstractfactory.human.FemaleYellowHuman;
import com.pattern.abstractfactory.human.Human;

public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman() {
        Human human = super.createHuman(FemaleYellowHuman.class);
        return human;
    }

    @Override
    public Human createWhiteHuman() {
        Human human = super.createHuman(FemaleWhiteHuman.class);
        return human;
    }

    @Override
    public Human createBlackHuman() {
        Human human = super.createHuman(FemaleBlackHuman.class);
        return human;
    }
}
