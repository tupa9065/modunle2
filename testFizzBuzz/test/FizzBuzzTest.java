import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    public static final String ONE = "one";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String INCORRECT = "Incorrect";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    @Test
    void Insert1ToOne() {
        int number = 1;
        String expected= ONE;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert3OutFizz(){
        byte number =3;
        String expected= FIZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert5OutBuzz(){
        byte number =5;
        String expected= BUZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert6OutFizz(){
        byte number =6;
        String expected=FIZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert10OutBuzz(){
        byte number =10;
        String expected=BUZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert19OutIncorrect(){
        byte number =19;
        String expected= INCORRECT;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert15OutFizzBuzz(){
        byte number =15;
        String expected= FIZZ_BUZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert30OutFizzBuzz(){
        byte number =30;
        String expected= FIZZ_BUZZ;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Insert13OutFizzBuzz(){
        byte number =13;
        String expected= INCORRECT;
        String actual= new FizzBuzz().fizzBuzz(number);
        assertEquals(expected,actual);
    }
}