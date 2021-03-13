import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main1 = new Main();

    @Test
    void factorialTruePositive() {
        int expected = 6;
         int actual = main1.factorial(3);
        assertEquals(expected, actual);
    }
    @Test
    void factorialFalseNegative() {
        int expected = 8;
        int actual = main1.factorial(3);
        assertNotEquals(expected, actual);
    }
    @Test
    void square_rootTruePositive() {
        double expected = 2;
       double actual = main1.square_root(4);
        assertEquals(expected, actual);
    }
    @Test
    void square_rootFalseNegative() {
        double expected = 1;
        double actual = main1.square_root(4);
        assertNotEquals(expected, actual);
    }
    @Test
    void logTruePositive() {
        double expected = 1.6094379124341003;
        double actual = main1.log(5);
        assertEquals(expected, actual);
    }
    @Test
    void logFalseNegative() {
        double expected = 1;
        double actual = main1.log(4);
        assertNotEquals(expected, actual);
    }
    @Test
    void powerTruePositive() {
        double expected = 9;
        double actual = main1.power(3,2);
        assertEquals(expected, actual);
    }
    @Test
    void powerFalseNegative() {
        double expected = 9;
        double actual = main1.power(3,5);
        assertNotEquals(expected, actual);
    }

}