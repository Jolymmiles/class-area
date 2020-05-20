import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    @Test
    void testgetArea() {
        Area area = new Area();
        double expected = 314.1592653589793;
        double actual = Area.getArea(10.0);
        assertEquals(expected,actual);
        expected = 375;
        actual = Area.getArea(15, 25);
        assertEquals(expected,actual);
        expected = 7690.618815987814;
        actual = Area.getArea(12.0, 17.0);
        assertEquals(expected,actual);
    }

    @Test
    void testGetArea1() {
        Area area = new Area();
        double expected = 0;
        double actual = Area.getArea(0);
        assertEquals(expected,actual);
        actual = Area.getArea(0, 23);
        assertEquals(expected,actual);
        actual = Area.getArea(0, 17.0);
        assertEquals(expected,actual);
    }

    @Test
    void testGetArea2() {
        Area area = new Area();
        double expected = 0;
        double actual = Area.getArea(-1);
        assertEquals(expected,actual);
        actual = Area.getArea(-1, 23);
        assertEquals(expected,actual);
        actual = Area.getArea(-1, 17.0);
        assertEquals(expected,actual);
    }

    @Test
    void testGetArea3() {
        Area area = new Area();
        double expected = 1661.9025137490005;
        double actual = Area.getArea(23);
        assertEquals(expected,actual);
        expected = 0;
        actual = Area.getArea(23, 0);
        assertEquals(expected,actual);
        actual = Area.getArea(17.0, 0);
        assertEquals(expected,actual);
    }

    @Test
    void testGetArea4() {
        Area area = new Area();
        double expected = 96211.2750161874;
        double actual = Area.getArea(175);
        assertEquals(expected,actual);
        expected = 0;
        actual = Area.getArea(220, -12);
        assertEquals(expected,actual);
        actual = Area.getArea(98.4, -17.0);
        assertEquals(expected,actual);
    }
}
