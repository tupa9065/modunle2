import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentsArray = new Student[10];
        studentsArray[0] = new Student(1, "tu", "91", 9f);
        studentsArray[1] = new Student(2, "tuan", "96", 8);
        for (int i = 2; i < studentsArray.length; i++) {
            studentsArray[i] = new Student();
        }
        int choice =1;
        while (choice!=0){
            System.out.println("Chương trình quản lý sinh viên ^^");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm một sinh viên mới");
            System.out.println("3. Chỉnh sửa thông tin của một sinh viên khi biết mã sinh viên");
            System.out.println("4. Xóa một sinh viên khỏi danh sách khi biết mã sinh viên");
            System.out.println("5. Tìm sinh viên có điểm cao nhất");
            System.out.println("6. Sắp xếp danh sách sinh viên theo điểm từ cao xuống thấp");
            System.out.println("0. Exit");
            System.out.println("Lựa chọn của bạn: ");
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
                default:{
                    System.out.println("Lựa chọn của bạn không hợp lệ, mời chọn lại");
                }
            }
        }

    }



}
