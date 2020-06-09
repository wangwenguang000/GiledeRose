import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsTest {

    @Test
    public void shouldGetGoodsWithSellinAndQuality() {
        var sellin = 10;
        var quality = 10;
        var goods = new Goods(sellin, quality);

        assertEquals(sellin, goods.getSellin());
        assertEquals(quality, goods.getQuality());

    }

    @Test
    public void shouldGet50GivenQualityBiggerThan50() {
        var sellin = 10;
        var quality = 100;
        var goods = new Goods(sellin, quality);

        assertEquals(10, goods.getSellin());
        assertEquals(50, goods.getQuality());

    }

    @Test
    public void shouldGet0GivenQualityLessThan0() {
        var sellin = 10;
        var quality = -10;
        var goods = new Goods(sellin, quality);

        assertEquals(10, goods.getSellin());
        assertEquals(0, goods.getQuality());

    }

    @Test
    public void shouldReduceQualityWhenHoldBeforeExpiredDate() {
        var goods = new Goods(10, 10);
        goods.hold(5);

        assertEquals(5, goods.getSellin());
        assertEquals(5, goods.getQuality());
    }

    @Test
    public void shouldReduceQuality2EachDayWhenHoldAfterExpiredDate() {
        var goods = new Goods(10, 20);
        goods.hold(12);

        assertEquals(0, goods.getSellin());
        assertEquals(6, goods.getQuality());
    }
}
