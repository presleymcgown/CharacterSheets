package com.prog2.panels;

import com.prog2.classes.*;

import javax.swing.*;

public class ClassPanel extends JPanel {

    private JPanel classChoicePanel;
    private JLabel classChoiceLabel;

    private JComboBox<CharacterClass> classChoiceCombo;

    public ClassPanel(){

        // initialize all the stuff
        classChoicePanel = new JPanel();

        classChoiceCombo = new JComboBox<>();

        initClassChoiceCombo();


        classChoiceLabel = new JLabel("Choose Your Class");

        // what layout should the main panel use?
        // what layout should the choice panel use?

        classChoicePanel.add(classChoiceLabel);
        classChoicePanel.add(classChoiceCombo);

        this.add(classChoiceLabel);
        this.add(classChoiceCombo);

    }

    private void initClassChoiceCombo(){

        classChoiceCombo = new JComboBox();

        classChoiceCombo.addItem(new Barbarian());
        classChoiceCombo.addItem(new Druid());


    }

    private void onClassSelected(){


    }

}
