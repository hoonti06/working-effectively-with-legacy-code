package me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.v3;

import me.hoonti06.workingeffectivelywithlegacycode.undetectablesideeffect.DetailFrame;

public class SymbolSource {
    private DetailFrame detailDisplay;

    public void setDescription(String description) {
        detailDisplay = new DetailFrame();
        detailDisplay.setDescription(description);
        detailDisplay.show();
    }

    public String getAccountSymbol() {
        return detailDisplay.getAccountSymbol();
    }

}
