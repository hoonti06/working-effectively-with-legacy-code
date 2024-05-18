package me.hoonti06.workingeffectivelywithlegacycode.hiddenmethod.v1;

// setSnapRegion 메서드의 접근제어자를 protected로 변경 -> 상속 받는 테스트 클래스에서 parent의 setSnapRegion 호출 가능
public class CCAImage {
    private int x;
    private int y;
    private int dx;
    private int dy;

    public void snap() {

    }

    protected void setSnapRegion(int x, int y, int dx, int dy) {

    }
}
