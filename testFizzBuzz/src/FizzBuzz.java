public class FizzBuzz {

    public static final String ONE = "one";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String INCORRECT = "Incorrect";

    public String fizzBuzz(int number){
        boolean equal1 = number == 1;
        if (equal1) {
            return ONE;
        }else {
            boolean isDivisible3 = number % 3 == 0;
            boolean isDivisible5 = number % 5 == 0;
            if(isDivisible3){
                if(isDivisible5){
                    return FIZZ_BUZZ;
                }
                return FIZZ;
            }else if(isDivisible5){
                return BUZZ;
            }
            else return INCORRECT;
        }
    }
}
