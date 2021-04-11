package staffManage;

import java.util.Scanner;

public class StaffManager {
    static int id;
    static String name;
    static int age;
    static String phoneNumber;
    static String mail;
    static int bonus=0;
    static int fines=0;
    static int salary=0;
    static int workTime=0;
    static Scanner scanner = new Scanner(System.in);
    public static void display(Staff[] staffs){
        for (Staff staff:staffs
             ) {
            System.out.println(staff);

        }
    }
    public static void addNew(){
        int newId = Staff.lastID+1;
        Staff.lastID++;
        Staff.totalStaff++;
        System.out.println("ID :"+newId);
        System.out.println("Name :");
        name=scanner.nextLine();
        System.out.println("Age :");
        age=scanner.nextInt();

        System.out.println("Phone number :");
        phoneNumber=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Mail :");
        mail=scanner.nextLine();
    }
    public static Staff addFullTime(){
        addNew();
        FullTime.totalSFT++;
        System.out.println("Salary :");
        salary=scanner.nextInt();
        System.out.println("Bonus :");
        bonus=scanner.nextInt();
        System.out.println("Fines :");
        fines=scanner.nextInt();
        Staff staff = new FullTime(id, name, age, phoneNumber, mail, bonus, fines, salary);
        return staff;
        
    }
    public static Staff addPartTime(){
        addNew();
        PartTime.totalSPT++;
        System.out.println("Working time :");
        workTime=scanner.nextInt();
        Staff staff = new PartTime(id, name, age, phoneNumber, mail, workTime);
        return staff;
    }
    public static void getLowIncome(Staff[] staffs){
        if(FullTime.totalSFT>0){
            FullTime[] fullTimes=new FullTime[FullTime.totalSFT];
            int totalSalary=0;
            int i=0;
            for (Staff staff:staffs) {
                if(staff.kindStaff().equals("staff full time")){
                    fullTimes[i]= (FullTime) staff;
                    i++;
                }
            }

            for (int j =0;j<fullTimes.length;j++) {
                totalSalary+=fullTimes[j].getTotalSalary();
            }
            int averageWage=totalSalary/fullTimes.length;
            for (FullTime ft:fullTimes) {
                if(ft.getTotalSalary()<averageWage){
                    System.out.println(ft);
                }
            }
        }else {
            System.out.println("There are no full-time employees");
        }
    }
    public static int getTotalSalaryPT(Staff[] staffs){
        int total=0;
        if(PartTime.totalSPT>0){
            PartTime[] partTimes=new PartTime[PartTime.totalSPT];
            int i=0;
            for (Staff staff:staffs) {
                if(staff.kindStaff().equals("staff part time")){
                    partTimes[i]= (PartTime) staff;
                    i++;
                }
            }
            for (PartTime pt:partTimes) {
                total+=pt.getTotalSalary();
            }

        }else {
            System.out.println("There are no part-time employees");
        }
        return total;
    }
}
