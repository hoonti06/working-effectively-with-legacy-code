package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v2;

import me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.DetailFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 - Introduction of 'detailDisplay' field
 - Extract 'setDescription' method from 'performCommand'
 - Extract 'setDisplayText' method from 'performCommand'
 - Extract 'getAccountSymbol' method from 'performCommand'
 */
public class AccountDetailFrame extends Frame implements ActionListener {
    private TextField display = new TextField(10);
    private DetailFrame detailDisplay;

    @Override
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        performCommand(source);
    }

    private void performCommand(String source) {
        if (source.equals("project activity")) {
            setDescription(getDetailText() + " " + getProjectionText());
            String accountDescription = getAccountSymbol();
            accountDescription += ": ";
            // ...
            setDisplayText(accountDescription);
            // ...
        }
        // ...
    }

    private void setDescription(String description) {
        detailDisplay = new DetailFrame();
        detailDisplay.setDescription(description);
        detailDisplay.show();
    }

    private String getAccountSymbol() {
        return detailDisplay.getAccountSymbol();
    }

    private void setDisplayText(String description) {
        display.setText(description);
    }

    private String getDetailText() {
        return "";
    }

    private String getProjectionText() {
        return "";
    }
}
