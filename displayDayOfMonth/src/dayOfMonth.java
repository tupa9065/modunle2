import java.util.Scanner;
public class dayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        String dayOfMonth;
        switch (month){
            case 2: {
                dayOfMonth =" has 28 or 29 day";
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                dayOfMonth =" has 31 day";
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                dayOfMonth =" has 30 day";
                break;
            }
            default:{
                dayOfMonth ="not invalid";
                break;
            }
        }
        System.out.printf("the month %d has %s",month,dayOfMonth);
    }
}
