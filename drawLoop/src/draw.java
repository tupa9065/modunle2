import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 rectangle");
        System.out.println("2 square botton-left triangle");
        System.out.println("3 square top-left  triangle");
        System.out.println("4 exit");
       int num = sc.nextInt();
       switch (num){
           case 1:{
               for (int i =0 ; i< 5;i++){
                   for (int j=0; j<5;j++){
                       System.out.print("*");
                   }
                   System.out.println();
               }
               break;
           }
           case 2:{
               for (int i =0 ; i< 5;i++){
                   for (int j=0; j<=i;j++){
                       System.out.print("*");
                   }
                   System.out.println();
               }
               break;

           }
           case 3:
           {
               for (int i =0 ; i< 5;i++){
                   for (int j=5-i; j<=5;j++){
                       System.out.print("*");
                   }
                   System.out.println();
               }
               break;
           }
           case 4:{
               System.exit(0);
           }
           default:{
               System.out.println("\n" + "illegal");
           }
       }
    }
}
