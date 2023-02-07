package com.prog2.panels;

import javax.swing.*;

public class RacePanel extends JPanel {

    JComboBox<String> raceCombo;

    public RacePanel(){

        super();

        raceCombo = new JComboBox<>();
        raceCombo.addItem("Human");
        raceCombo.addItem("Dwarf");
        raceCombo.addItem("Elf");

        add(raceCombo);


    }

}
