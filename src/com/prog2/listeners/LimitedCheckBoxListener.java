package com.prog2.listeners;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LimitedCheckBoxListener implements ItemListener {

    // reference to the checkboxes we are listening to
    private JCheckBox[] boxes;

    // the number of checkboxes currently selected
    private int selectedCount;

    // the maximum number of boxes that can be selected
    private int MAX_CHOICES;

    /**
     * Sets the choice limit and creates the reference to the checkbox array
     *
     * @param choiceLimit the maximum number of checkboxes that can be selected at a given time
     * @param boxes       the array of checkboxes to be concerned with
     */
    public LimitedCheckBoxListener(int choiceLimit, JCheckBox... boxes) {
        this.MAX_CHOICES = choiceLimit;
        this.boxes = boxes;

        selectedCount = 0;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        // The checkbox that was clicked on, causing this event to fire
        JCheckBox source = (JCheckBox) e.getSource();


        if (source.isSelected()) { // we just selected a box

            // increase the amount of selected boxes
            selectedCount++;

            // see if the maximum number of boxes have been selected
            if (selectedCount == MAX_CHOICES) {

                // disable all non-selected boxes
                for (JCheckBox box : boxes) {
                    if (!box.isSelected()) {
                        box.setEnabled(false);
                    }
                }
            }

        } else { // we just de-selected a box

            // a box was deselected, decrement counter
            selectedCount--;

            // re-enable all disables boxes
            if (selectedCount < MAX_CHOICES) {
                for (JCheckBox box : boxes) {
                    box.setEnabled(true);
                }
            }

        }

    }


}