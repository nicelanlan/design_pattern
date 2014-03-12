package com.pattern.abstractfactory.human;

public enum HumanEnum {
    YELLOW_FEMALE_HUMAN("com.pattern.abstractfactory.FemaleYellowHuman"),
    YELLOW_MALE_HUMAN("com.pattern.abstractfactory.MaleYellowHuman"),
    WHITE_FEMALE_HUMAN("com.pattern.abstractfactory.FemaleWhiteHuman"),
    WHITE_MALE_HUMAN("com.pattern.abstractfactory.MaleWhiteHuman"),
    BLACK_FEMALE_HUMAN("com.pattern.abstractfactory.FemaleBlackHuman"),
    BLACK_MALE_HUMAN("com.pattern.abstractfactory.MaleBlackHuman");
    
    private String value;
    
    private HumanEnum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
}
