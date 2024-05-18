package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v3;

import java.awt.*;

public class AccountDetailDisplay {
    private final TextField display;

    public AccountDetailDisplay() {
        this(new TextField(10));
    }
    public AccountDetailDisplay(TextField display) {
        this.display = display;
    }

    public void setDisplayText(String description) {
        display.setText(description);
    }

}
