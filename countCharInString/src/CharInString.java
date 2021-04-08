import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String str = sc.nextLine();
        char[] strArray = str.toCharArray();
        System.out.println("nhập ký tự cần tìm");
        String c = sc.nextLine();
        char[] cArray =c.toCharArray();
        int count =0;
        for(char i:strArray){
            if(cArray[0]==i){
                count++;
            }
        }
        System.out.println(c +" xuất hiện "+count+"lần");


    }
}
