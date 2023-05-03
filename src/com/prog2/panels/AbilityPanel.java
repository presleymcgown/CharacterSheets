package com.prog2.panels;

import javax.swing.*;
import java.awt.*;

public class AbilityPanel extends JPanel {

  JLabel pointsRemainingLabel;
  JLabel numPointsRemLabel;
  int numPointsRem = 27;

  JPanel abilitiesView;
  JPanel pointsView;

  JLabel strengthLabel;
  JLabel dexterityLabel;
  JLabel constitutionLabel;
  JLabel intelligenceLabel;
  JLabel wisdomLabel;
  JLabel charismaLabel;

  int strenthPnts;
  int dexterityPnts;
  int constitutionPnts;
  int intelligencePnts;
  int winsdomPnts;
  int charismaPnts;

  JComboBox strengthChoice;
  JComboBox dexterityChoice;
  JComboBox constitutionChoice;
  JComboBox intelligenceChoice;
  JComboBox wisdomChoice;
  JComboBox charismaChoice;

  public AbilityPanel(){

    pointsView = new JPanel(new GridLayout(2,2));

    add(pointsView);

    pointsRemainingLabel = new JLabel("Points Remaining:");
    numPointsRemLabel = new JLabel(" " + numPointsRem);

    pointsView.add(pointsRemainingLabel);
    pointsView.add(numPointsRemLabel);

    abilitiesView = new JPanel(new GridLayout(6, 2));

    pointsView.add(abilitiesView);

    strengthChoice = new JComboBox();
    dexterityChoice = new JComboBox();
    constitutionChoice = new JComboBox();
    intelligenceChoice = new JComboBox();
    wisdomChoice = new JComboBox();
    charismaChoice = new JComboBox();

    strengthChoice = initComboBoxes(strengthChoice);
    dexterityChoice = initComboBoxes(dexterityChoice);
    constitutionChoice = initComboBoxes(constitutionChoice);
    intelligenceChoice = initComboBoxes(intelligenceChoice);
    wisdomChoice = initComboBoxes(wisdomChoice);
    charismaChoice = initComboBoxes(charismaChoice);

    strengthLabel = new JLabel("Strength");
    dexterityLabel = new JLabel("Dexterity");
    constitutionLabel = new JLabel("Constitution ");
    intelligenceLabel = new JLabel("Intelligence");
    wisdomLabel = new JLabel("Wisdom");
    charismaLabel = new JLabel("Charisma");

    abilitiesView.add(strengthLabel);
    abilitiesView.add(strengthChoice);
    abilitiesView.add(dexterityLabel);
    abilitiesView.add(dexterityChoice);
    abilitiesView.add(constitutionLabel);
    abilitiesView.add(constitutionChoice);
    abilitiesView.add(intelligenceLabel);
    abilitiesView.add(intelligenceChoice);
    abilitiesView.add(wisdomLabel);
    abilitiesView.add(wisdomChoice);
    abilitiesView.add(charismaLabel);
    abilitiesView.add(charismaChoice);

  }

  private JComboBox initComboBoxes(JComboBox boxA){

    JComboBox box = boxA;

    for (int i = 0; i <= 9; i++) {
      box.addItem(i);
    }

    return box;

  }

}
