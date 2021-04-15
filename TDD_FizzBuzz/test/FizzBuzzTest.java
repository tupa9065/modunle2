import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void gameFizzBuzz() {
        int number = 3;
        String expected = "Fizz";
        String result = fizzBuzz.gameFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void gameFizzBuzz2() {
        int number = 5;
        String expected = "Buzz";
        String result = fizzBuzz.gameFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void gameFizzBuzz3() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = fizzBuzz.gameFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void gameFizzBuzz4() {
        int number = 26;
        String expected = ""+number;
        String result = fizzBuzz.gameFizzBuzz(number);
        assertEquals(expected,result);
    }
}