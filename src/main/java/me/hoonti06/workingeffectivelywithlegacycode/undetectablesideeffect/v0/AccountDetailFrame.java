package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v0;

import me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.DetailFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountDetailFrame extends Frame implements ActionListener {
    private TextField display = new TextField(10);

    @Override
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        if (source.equals("project activity")) {
            DetailFrame detailDisplay = new DetailFrame();
            detailDisplay.setDescription(getDetailText() + " " + getProjectionText());
            detailDisplay.show();
            String accountDescription = detailDisplay.getAccountSymbol();
            accountDescription += ": ";
            // ...
            display.setText(accountDescription);
            // ...
        }
        // ...
    }

    private String getDetailText() {
        return "";
    }

    private String getProjectionText() {
        return "";
    }
}
