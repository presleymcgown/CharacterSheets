package com.prog2.enums;

public enum Skill {

    ACROBATICS, ANIMAL_HANDLING("Animal Handling"), ARCANA, ATHLETICS, DECEPTION, HISTORY, INSIGHT, INTIMIDATION, INVESIGATION, MEDICINE, NATURE, PERCEPTION, PERFORMANCE, PERSUASION, RELIGION, SLIEGHT_OF_HAND("Slight of Hand"), STEALTH, SURVIVAL;

    private String displayName;

    Skill(){

        String s = name().toLowerCase();
        this.displayName = s.substring(0,1).toUpperCase() + s.substring(1);

    }

    Skill(String displayName){

        this.displayName = displayName;

    }

    public String toString(){

        return displayName;

    }

}
