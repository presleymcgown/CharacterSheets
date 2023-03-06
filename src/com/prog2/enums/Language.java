package com.prog2.enums;

public enum Language {

    DWARVISH, COMMON, ELVISH, GIANT, GNOMISH, GOBLIN, HALFLING, ORC, ABYSSAL, CELESTIAL, DRACONIC, DEEP_SPEECH("Deep Speech"), INFERNAL, PRIMORDIAL, SYLVAN, UNDERCOMMON;

    private String displayName;

    Language(){

        String s = name().toLowerCase();
        this.displayName = s.substring(0,1).toUpperCase() + s.substring(1);

    }

    Language(String displayName){

        this.displayName = displayName;

    }

    public String toString(){

        return displayName;

    }

}
