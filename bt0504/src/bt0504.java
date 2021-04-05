import java.util.Scanner;

public class bt0504 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;
     while (ck){
         System.out.println("enter the number");
         int num = sc.nextInt();
         System.out.println("1. kiểm tra số nguyên tố");
         System.out.println("2. kiểm tra số chẵn lẻ");
         System.out.println("3. kiểm tra số chính phương");
         System.out.println("4. thoát chương trình");
         int choice = sc.nextInt();
         switch (choice){
             case 1:{
                if(num>2){
                    boolean prime =true;
                    for (int i =2 ; i < num ;i++){
                        if(num%i==0){
                            prime=false;
                            break;
                        }
                    }
                    if (prime){
                        System.out.println(num+" là số nguyên tố");
                    }else {
                        System.out.println(num+" không phải số nguyên tố");
                    }
                }else {
                    System.out.println(num+" không là số nguyên tố");

                }
                 break;
             }
             case 2:{
                 if(num%2==0){
                     System.out.println(num+" là số chẵn");
                 }else {
                     System.out.println(num+" là số lẻ");

                 }
                 break;
             }
             case 3:{
                 double x = Math.sqrt(num);
                 if(x-Math.floor(x)==0){
                     System.out.println(num+" là số chính phương");
                 }else {
                     System.out.println(num+" không phải số chính phương");

                 }
                 break;
             }
             case 4:{
                 ck=false;
             }
         }
     }

    }
}
