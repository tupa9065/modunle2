import java.util.Scanner;

public class seach {

    public static void main(String[] args) {
        String[] students = {"Tu","Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name you want find");
        String name = sc.nextLine();
        int index=-1;
        for(int i =0 ; i<students.length;i++){
            if(students[i].equals(name)){
                index=i;
                break;
            }
        }

        if(index!=-1){
            System.out.println(name+" ranked "+(index+1)+" in class");
        }else {
            System.out.println("not find your name in student");
        }


    }
}
