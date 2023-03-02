package com.prog2.classes;

import com.prog2.listeners.LimitedCheckBoxListener;

import javax.swing.*;
import java.awt.*;

public class Druid extends CharacterClass{

    private String[] skillOptions = {
            "Arcana",
            "Animal Handling",
            "Insight",
            "Medicine",
            "Nature",
            "Perception",
            "Religion",
            "Survival"
    };

    private JCheckBox[] skillCheckBoxes;

    public Druid(){

        this.className = "Druid";
        this.hitDice = 8;

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

        this.savingThrows.put("Intelligence", true);
        this.savingThrows.put("Wisdom", true);

        this.equipment.add("Wooden Shield");
        this.equipment.add("Any Simple Weapon");
        this.equipment.add("Scimitar");
        this.equipment.add("Any Simple Melee Weapon");


    }

    @Override
    public JPanel getSpecialUI() {

        JPanel specialUI = new JPanel(new GridLayout(0, 2));

        JLabel skillChoiceLabel = new JLabel("Choose two of the following skills: ");

        JPanel skillChoicePanel = new JPanel();

        skillChoicePanel.setLayout(new BoxLayout(skillChoicePanel, BoxLayout.PAGE_AXIS));

        skillCheckBoxes = new JCheckBox[skillOptions.length];

        LimitedCheckBoxListener listener = new LimitedCheckBoxListener(2, skillCheckBoxes);

        for (int i = 0; i < skillCheckBoxes.length; i++) {
            skillCheckBoxes[i] = new JCheckBox(skillOptions[i]);
            skillCheckBoxes[i].addItemListener(listener);
            skillChoicePanel.add(skillCheckBoxes[i]);
        }

        specialUI.add(skillChoiceLabel);
        specialUI.add(skillChoicePanel);

        return specialUI;
    }

}
