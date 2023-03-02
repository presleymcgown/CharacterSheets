package com.prog2.classes;

import com.prog2.listeners.LimitedCheckBoxListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Barbarian extends CharacterClass {

    // * Both Instance variables are for the special UI
    private String[] skillOptions = {
            "Animal Handling",
            "Athletics",
            "Intimidation",
            "Nature",
            "Perception",
            "Survival"
    };

    private JCheckBox[] skillCheckBoxes;


    /**
     * Add all simple data that applies to the Barbarian class.
     */
    public Barbarian(){

        this.className = "Barbarian";
        this.hitDice = 12;

        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");

        savingThrows.put("Strength", true);
        savingThrows.put("Constitution", true);

        weapons.add("Greataxe");
        equipment.add("Explorer's Pack");
        equipment.add("Javelins x4");

        traits.add("Rage");
        traits.add("Unarmored Defense");
        traits.add("Reckless Attack");
        traits.add("Danger Sense");

        subclasses.add("Berserker");
        subclasses.add("Totem");
    }

    @Override
    public JPanel getSpecialUI(){

        // The specialized panel we want to build. Using a grid layout because we have two chunks: instructions and a list of checkboxes.
        JPanel specialUI = new JPanel(new GridLayout(0, 2));

        // Just instructions for the user
        JLabel skillChoiceLabel = new JLabel("Choose two of the following skills: ");

        // A JPanel specifically to hold all the checkboxes (there are 6 in this case)
        JPanel skillChoicePanel = new JPanel();

        // Using a BoxLayout on the PAGE_AXIS creates a vertical listing of the checkboxes.
        skillChoicePanel.setLayout(new BoxLayout(skillChoicePanel, BoxLayout.PAGE_AXIS));

        // Initialize the checkbox array
        skillCheckBoxes = new JCheckBox[skillOptions.length];

        // A custom listener that takes a group of check boxes and limits the number of choices a user can make within that list.
        LimitedCheckBoxListener listener = new LimitedCheckBoxListener(2, skillCheckBoxes);

        // Populate the checkbox array and have all the checkboxes share our custom listener.
        for (int i = 0; i < skillCheckBoxes.length; i++) {
            skillCheckBoxes[i] = new JCheckBox(skillOptions[i]);
            skillCheckBoxes[i].addItemListener(listener);
            skillChoicePanel.add(skillCheckBoxes[i]);
        }

        // Add the label and checkbox panel to the specialUI panel and return it.
        specialUI.add(skillChoiceLabel);
        specialUI.add(skillChoicePanel);

        return specialUI;
    }

}