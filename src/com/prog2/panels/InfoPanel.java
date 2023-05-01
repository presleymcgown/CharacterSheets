package com.prog2.panels;

import com.prog2.backgrounds.Sailor;
import com.prog2.enums.Alignment;
import com.prog2.enums.Skill;

import javax.swing.*;

public class InfoPanel extends JPanel {

    JLabel characterNameLabel;
    JTextField characterName;
    JLabel playerNameLabel;
    JTextField playerName;
    JLabel alignmentLabel;
    JComboBox alignment;
    JLabel backgroundLabel;
    JComboBox background;

    public InfoPanel(){


        characterNameLabel = new JLabel("Type your character's name.");
        characterName = new JTextField("Character Name:");

        add(characterNameLabel);
        add(characterName);

        playerNameLabel = new JLabel("Type the player's name here:");
        playerName = new JTextField("Player Name:");

        add(playerNameLabel);
        add(playerName);

        alignmentLabel = new JLabel("Choose your alignment.");
        initAlignment();

        add(alignmentLabel);
        add(alignment);

        backgroundLabel = new JLabel("Choose your background.");
        initBackground();

        add(backgroundLabel);
        add(background);

    }

    private void initAlignment(){

        alignment = new JComboBox();

        alignment.addItem(Alignment.CHAOTIC_EVIL.toString());
        alignment.addItem(Alignment.CHAOTIC_GOOD.toString());
        alignment.addItem(Alignment.CHAOTIC_NEUTRAL.toString());

        alignment.addItem(Alignment.NEUTRAL_EVIL.toString());
        alignment.addItem(Alignment.NEUTRAL_GOOD.toString());
        alignment.addItem(Alignment.TRUE_NEUTRAL.toString());

        alignment.addItem(Alignment.LAWFUL_EVIL.toString());
        alignment.addItem(Alignment.LAWFUL_GOOD.toString());
        alignment.addItem(Alignment.LAWFUL_NEUTRAL.toString());

    }

    private void initBackground(){

        background = new JComboBox();

        background.addItem(new Sailor().backgroundName);

    }


}
