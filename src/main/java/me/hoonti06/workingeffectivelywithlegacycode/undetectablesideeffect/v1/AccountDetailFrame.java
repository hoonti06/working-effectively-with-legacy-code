package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v1;

import me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.DetailFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Extract method 'performCommand' from actionPerformed
public class AccountDetailFrame extends Frame implements ActionListener {
    private TextField display = new TextField(10);

    @Override
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        performCommand(source);
    }

    private void performCommand(String source) {
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
