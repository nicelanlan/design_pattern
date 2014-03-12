package com.pattern.abstractfactory;

import com.pattern.abstractfactory.factory.FemaleHumanFactory;
import com.pattern.abstractfactory.factory.HumanFactory;
import com.pattern.abstractfactory.factory.MaleHumanFactory;
import com.pattern.abstractfactory.human.Human;

public class Client {
    public static void main(String args[]) {
        HumanFactory femaleFactory = new FemaleHumanFactory();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.sex();
        Human femaleWhiteHuman = femaleFactory.createWhiteHuman();
        femaleWhiteHuman.sex();
        Human femaleBlackHuman = femaleFactory.createBlackHuman();
        femaleBlackHuman.sex();
        
        HumanFactory maleFactory = new MaleHumanFactory();
        Human maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.sex();
        Human maleWhiteHuan = maleFactory.createWhiteHuman();
        maleWhiteHuan.sex();
        Human maleBlackHuman = maleFactory.createBlackHuman();
        maleBlackHuman.sex();
    }
}
