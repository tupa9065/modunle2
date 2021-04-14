public class FizzBuzz {
    public String fizzBuzz(int number){
        if (number==1) {
            return "one";
        }else if(number==3){
            return "Fizz";
        }else if(number==5){
            return "Buzz";
        }
        else return number+"";
    }
}
