package com.prog2.panels;

import com.prog2.enums.Skill;

import javax.swing.*;

public class InfoPanel extends JPanel {

    JLabel demo;

    public InfoPanel(){

        demo = new JLabel(Skill.ANIMAL_HANDLING.toString());
        add(demo);

    }


}
