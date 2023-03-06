package com.prog2.backgrounds;

import com.prog2.enums.Language;
import com.prog2.enums.Skill;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Background {

    public String backgroundName;

    public HashMap<Skill, Boolean> firstSkill;
    public HashMap<Skill, Boolean> secondSkill;

    public ArrayList<String> proficiencies;
    public HashMap<Language, Boolean> language;
    public HashMap<String, Boolean> equipment;

    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;

    public Background(){

        firstSkill = new HashMap<>();
        secondSkill = new HashMap<>();

        proficiencies = new ArrayList<>();
        language = new HashMap<>();
        equipment = new HashMap<>();

    }

}
