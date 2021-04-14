import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void Insert1ToOne() {
        int number = 1;
        String expected="one";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert3OutFizz(){
        byte number =3;
        String expected="Fizz";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
}