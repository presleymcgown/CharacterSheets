package com.prog2.panels;

import javax.swing.*;
import java.awt.*;

public class AbilityPanel extends JPanel {

  JLabel pointsRemainingLabel;
  JLabel numPointsRemLabel;
  int numPointsRem = 27;

  JPanel abilitiesView;

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

    pointsRemainingLabel = new JLabel("Points Remaining:");
    numPointsRemLabel = new JLabel(" " + numPointsRem);

    add(pointsRemainingLabel);
    add(numPointsRemLabel);

    abilitiesView = new JPanel(new GridLayout(6, 2));

    initComboBoxes(strengthChoice);
    initComboBoxes(dexterityChoice);
    initComboBoxes(constitutionChoice);
    initComboBoxes(intelligenceChoice);
    initComboBoxes(wisdomChoice);
    initComboBoxes(charismaChoice);

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

  private void initComboBoxes(JComboBox box){

    for (int i = 0; i <= 9; i++) {
      box.addItem(i);
    }

  }

}
