package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 - AccountDetailDisplay 클래스를 생성하여 DetailFrame 타입의 detailDisplay 필드 및 getAccountSymbol 메서드 이동
 - SymbolSource 클래스를 생성하여 TextField 타입의 display 필드 및 setDescription, getAccountSymbol 메서드 이동
 */
public class AccountDetailFrame extends Frame implements ActionListener {
    private final AccountDetailDisplay accountDetailDisplay;
    private final SymbolSource symbolSource;

    public AccountDetailFrame(SymbolSource symbolSource, AccountDetailDisplay accountDetailDisplay)
            throws HeadlessException {
        this.symbolSource = symbolSource;
        this.accountDetailDisplay = accountDetailDisplay;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        performCommand(source);
    }

    private void performCommand(String source) {
        if (source.equals("project activity")) {
            symbolSource.setDescription(getDetailText() + " " + getProjectionText());
            String accountDescription = symbolSource.getAccountSymbol();
            accountDescription += ": ";
            // ...
            accountDetailDisplay.setDisplayText(accountDescription);
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
