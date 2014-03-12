package com.pattern.abstractfactory.factory;

import com.pattern.abstractfactory.human.Human;

public interface HumanFactory {
    public Human createYellowHuman();
    public Human createWhiteHuman();
    public Human createBlackHuman();
}
