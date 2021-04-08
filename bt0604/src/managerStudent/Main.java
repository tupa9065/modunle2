package managerStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentsArray = new Student[10];
        studentsArray[0] = new Student(1, "tu", "91", 9f);
        studentsArray[1] = new Student(2, "tuan", "96", 8);
        for (int i = Student.latID; i < studentsArray.length; i++) {
            studentsArray[i] = new Student();
        }
        int choice =-1;
        while (choice!=0){
            Manager.menu();
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    Manager.displayStudent(studentsArray);
                    break;
                }
                case 2:{
                        Manager.addStudent(studentsArray);
                    break;
                }
                case 3:{
                    Manager.editStudent(studentsArray);
                    break;
                }
                case 4:{
                    Manager.deleteStudent(studentsArray);
                    break;
                }
                case 5:{
                    Student topScore= Manager.topScore(studentsArray);
                    System.out.println("Người đạt điểm cao nhất là "+topScore.getName()+" với "+topScore.getScore());
                    break;
                }
                case 6:{
                    Manager.sortByScore(studentsArray);
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Lựa chọn của bạn không hợp lệ, mời chọn lại");
                }
            }
        }

    }



}
