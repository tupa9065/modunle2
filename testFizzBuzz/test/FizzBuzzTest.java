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
    @Test
    void Insert5OutBuzz(){
        byte number =5;
        String expected="Buzz";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert6OutFizz(){
        byte number =6;
        String expected="Fizz";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert10OutBuzz(){
        byte number =10;
        String expected="Buzz";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert19OutIncorrect(){
        byte number =19;
        String expected= "Incorrect";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert15OutFizzBuzz(){
        byte number =15;
        String expected= "FizzBuzz";
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
}