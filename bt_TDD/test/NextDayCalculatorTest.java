import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class NextDayCalculatorTest {

    @Test
    void nextDayTest01012001() {
        int day = 1;
        int mont =1;
        int year=2001;
        int expected = 2;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest31012001() {
        int day = 31;
        int mont =1;
        int year=2001;
        int expected = 1;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest31072001() {
        int day = 31;
        int mont =7;
        int year=2001;
        int expected = 1;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest30012001() {
        int day = 30;
        int mont =1;
        int year=2001;
        int expected = 31;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest29022021() {
        int day = 31;
        int mont =1;
        int year=2001;
        int expected = -1;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest29022020() {
        int day = 29;
        int mont =2;
        int year=2020;
        int expected = 1;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest31122020() {
        int day = 31;
        int mont =12;
        int year=2020;
        int expected = 1;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }
    @Test
    void nextDayTest15022020() {
        int day = 15;
        int mont =2;
        int year=2020;
        int expected = 16;
        int result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected, result);
    }

}