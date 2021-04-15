public class FizzBuzz {
    public String gameFizzBuzz(int number) {
        boolean isThree = number % 3 == 0;
        boolean isFive = number % 5 == 0;
        if (isFive) {
            if (isThree){
                return "FizzBuzz";
            }else {
                return "Buzz";
            }
        }else if (isThree){
            return "Fizz";
        }
        return ""+number;
    }
}
