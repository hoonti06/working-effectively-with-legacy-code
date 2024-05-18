package me.hoonti06.workingeffectivelywithlegacycode.hiddenmethod.v1;

import org.junit.jupiter.api.Test;

class CCAImageTest {

    @Test
    void test() {
        // given
        CCAImage ccaImage = new TestingCCAImage();

        // when
        ccaImage.setSnapRegion(0, 0, 10, 10);
    }

    static class TestingCCAImage extends CCAImage {
        public void setSnapRegion(int x, int y, int dx, int dy) {
            // protected 메서드 호출 가능
            super.setSnapRegion(x, y, dx, dy);
        }
    }

}