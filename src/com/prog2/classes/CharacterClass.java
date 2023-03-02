package com.prog2.classes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class CharacterClass {

    public String className;

    // Stats and Knowledge

    public int hitDice;

    public ArrayList<String> proficiencies;

    public HashMap<String, Boolean> skills;

    public HashMap<String, Boolean> savingThrows;

    // Equipment category
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> equipment;

    // Class Specific
    public ArrayList<String> traits;

    public ArrayList<String> subclasses;


    protected CharacterClass(){
        proficiencies = new ArrayList<>();

        skills = new HashMap<>();
        savingThrows = new HashMap<>();

        weapons = new ArrayList<>();
        armor = new ArrayList<>();
        equipment = new ArrayList<>();
        traits = new ArrayList<>();
        subclasses = new ArrayList<>();
    }

    @Override
    public String toString(){
        return className;
    }

    public abstract JPanel getSpecialUI();
}
