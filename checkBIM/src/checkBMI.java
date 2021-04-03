
import java.*;
import java.util.Scanner;

public class checkBMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String interpretation ="";
        boolean ckWhile=true;

        while (ckWhile==true){
            System.out.println("nhập cân nặng của bạn tính theo Kg");
            double heft= sc.nextDouble();
            System.out.println("nhập chiều của bạn tính theo m");
            double height= sc.nextDouble();
            double bmi=heft/Math.pow(height,2);
            if(bmi<=30.0){
                if(bmi<=25){
                    if(bmi<18){
                        interpretation="UnderWeight";
                    }else {
                        interpretation="Normal";
                    }

                }else {
                    interpretation="OverWeight";
                }

            }else {
                interpretation ="Obese";
            }
            System.out.println(interpretation);
            System.out.println("dừng lại nhấn 0, nhấn số bất kỳ để tiếp tục");
            int stop=sc.nextInt();
            if(stop==0){
                ckWhile=false;
            }

        }
    }
}
