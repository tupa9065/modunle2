import java.util.Scanner;

public class FizzBuzz {
    static Scanner scanner = new Scanner(System.in);
    public static void getFizzBuzz(int number){
        boolean isDivisibleBy3 ;
        boolean isDivisibleBy5 ;
        isDivisibleBy3 = number%3==0;
        isDivisibleBy5 = number%5==0;
        if(isDivisibleBy3){
            if(isDivisibleBy5){
                System.out.println("FIZZBUZZ");
            }else {
                System.out.println("FIZZ");
            }
        }else if (isDivisibleBy5){
            System.out.println("BUZZ");
        }else {
            System.out.println(number+" not divisible by 3 and 5");
        }
    }
    public static int setNumber(){
        int number;
        System.out.println("enter the number");
        number= scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        int number = setNumber();
        getFizzBuzz(number);
    }
}
