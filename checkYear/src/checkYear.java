import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str ="";
        boolean ck = true;
        while (ck == true) {
            System.out.println("Nhập năm bạn muốn kiểm tra");
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        str = "Năm nhuận";
                    } else {
                        str = "Không phải năm nhuận";
                    }
                } else {
                    str = "Năm nhuận";
                }
            } else {
                str = "Không phải năm nhuận";
            }
            System.out.println(str);

            System.out.println("dừng lại nhấn 0, nhấn số bất kỳ để tiếp tục");
            int num;
            num = sc.nextInt();
            if (num == 0) {
                ck = false;
            }
        }
    }
}
