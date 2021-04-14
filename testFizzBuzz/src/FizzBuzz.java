public class FizzBuzz {
    public String fizzBuzz(int number){
        if (number==1) {
            return "one";
        }else if(number%3==0){
            if(number%5==0){
                return "FizzBuzz";
            }
            return "Fizz";
        }else if(number%5==0){
            return "Buzz";
        }else if(number==19){
            return "Incorrect";
        }
        else return number+"";
    }
}
