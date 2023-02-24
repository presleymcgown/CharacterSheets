package com.prog2.classes;

public class Druid extends CharacterClass{

    public Druid(){

        this.proficiencies.add("Light Armor");
        this.proficiencies.add("Medium Armor");
        this.proficiencies.add("Shields");
        this.proficiencies.add("Clubs");
        this.proficiencies.add("Daggers");
        this.proficiencies.add("Darts");
        this.proficiencies.add("Javelins");
        this.proficiencies.add("Maces");
        this.proficiencies.add("Quarterstaffs");
        this.proficiencies.add("Scimitars");
        this.proficiencies.add("Sickles");
        this.proficiencies.add("Slings");
        this.proficiencies.add("Spears");
        this.proficiencies.add("Herbalism Kit");

        this.savingThrows.add("Intelligence");
        this.savingThrows.add("Wisdom");

        this.skillChoices.add("Arcana");
        this.skillChoices.add("Animal Handling");
        this.skillChoices.add("Insight");
        this.skillChoices.add("Medicine");
        this.skillChoices.add("Nature");
        this.skillChoices.add("Perception");
        this.skillChoices.add("Religion");
        this.skillChoices.add("Survival");

        this.equipmentChoiceOne.add("Wooden Shield");
        this.equipmentChoiceOne.add("Any Simple Weapon");
        this.equipmentChoiceTwo.add("Scimitar");
        this.equipmentChoiceTwo.add("Any Simple Melee Weapon");


    }

}
