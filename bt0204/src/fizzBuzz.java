import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%5==0){
            if(num%3==0){
                System.out.println("FIZZBUZZ");
            }else {
                System.out.println("BUZZ");
            }
        }else if (num%3==0){
            System.out.println("FIZZ");
        }
        
    }
}
