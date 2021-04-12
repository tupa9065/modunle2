package staffManage;

import java.util.Scanner;

public class StaffManager {
     int id;
     String name;
     int age;
     String phoneNumber;
     String mail;
     int bonus=0;
     int fines=0;
     int salary=0;
     int workTime=0;
     Scanner scanner = new Scanner(System.in);
    public  void display(Staff[] staffs){
        for (Staff staff:staffs
             ) {
            System.out.println(staff);

        }
    }
    public  void addNew(){
        int newId = Staff.lastID+1;
        Staff.lastID++;
        Staff.totalStaff++;
        System.out.println("ID :"+newId);
        System.out.println("Name :");
        name=scanner.nextLine();
        System.out.println("Age :");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Phone number :");
        phoneNumber=scanner.nextLine();
        System.out.println("Mail :");
        mail=scanner.nextLine();
    }
    public  Staff addFullTime(){
        addNew();
        scanner.nextLine();
        FullTime.totalSFT++;
        System.out.println("Salary :");
        salary=scanner.nextInt();
        System.out.println("Bonus :");
        bonus=scanner.nextInt();
        System.out.println("Fines :");
        fines=scanner.nextInt();
        scanner.nextLine();
        Staff staff = new FullTime(id, name, age, phoneNumber, mail, bonus, fines, salary);
        return staff;
        
    }
    public  Staff addPartTime(){
        addNew();
        PartTime.totalSPT++;
        System.out.println("Working time :");
        workTime=scanner.nextInt();
        scanner.nextLine();
        Staff staff = new PartTime(id, name, age, phoneNumber, mail, workTime);
        return staff;
    }
    public  void getLowIncome(Staff[] staffs){
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
    public  int getTotalSalaryPT(Staff[] staffs){
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
