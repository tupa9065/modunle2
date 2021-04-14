import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        int number = 1;
        String expected="one";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
}