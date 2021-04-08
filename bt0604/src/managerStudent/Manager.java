package managerStudent;

import java.util.Scanner;

public class Manager {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("Chương trình quản lý sinh viên ^^");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm một sinh viên mới");
        System.out.println("3. Chỉnh sửa thông tin của một sinh viên khi biết mã sinh viên");
        System.out.println("4. Xóa một sinh viên khỏi danh sách khi biết mã sinh viên");
        System.out.println("5. Tìm sinh viên có điểm cao nhất");
        System.out.println("6. Sắp xếp danh sách sinh viên theo điểm từ cao xuống thấp");
        System.out.println("0. Exit");
        System.out.println("Lựa chọn của bạn: ");
    }

    public static void displayStudent(Student[] students) {
        System.out.println("============================Student list==========================");
        for (Student student : students) {
            if (student.getId() != 0) {
                System.out.println(student.toString());
            }
        }
        System.out.println("==================================================================");
    }

    public static int totalStudent(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getId() != 0) {
                count++;
            }
        }
        return count;
    }
    public static void inforStudent(Student student){
        System.out.print("Nhập tên: ");
        student.setName(sc.next());
        System.out.print("Nhập năm sinh: ");
        student.setBirthday(sc.next());
        System.out.print("Nhập điểm: ");
        student.setScore(sc.nextFloat());
    }
    public static void addStudent(Student[] students) {
        int totalStudent = totalStudent(students);
        if (totalStudent < 10) {
            int newID = Student.latID + 1;
            for (Student student : students) {
                if (student.getId() == 0) {
                    System.out.println("ID của sinh viên mới:" + newID);
                    student.setId(newID);
                    inforStudent(student);
                    break;
                }
            }
            Student.latID = newID;
        } else {
            System.out.println("Lớp đã đủ học viên.");
        }

    }

    public static void editStudent(Student[] students) {
        System.out.println("nhập mã sinh viên :");
        int editID = sc.nextInt();
        int ck = 0;
        for (Student student : students) {
            if (editID == student.getId()) {
                inforStudent(student);
                ck = 1;
            }
        }
        if (ck == 0) {
            System.out.println("không tìm thấy mã số sinh viên " + editID);
        }
    }

    public static void deleteStudent(Student[] students) {
        System.out.println("nhập mã sinh viên :");
        int deleteID = sc.nextInt();
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == deleteID) {
                index = i;
                for (int j = index; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
        if (index == -1) {
            System.out.println("không tìm thấy mã số sinh viên " + deleteID);
        }
    }

    public static Student topScore(Student[] students) {
        Student topScore = new Student();
        float max = students[0].getScore();
        int index = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getScore() > max) {
                max = students[i].getScore();
                index = i;
            }
        }
        topScore = students[index];
        return topScore;
    }

    public static void sortByScore(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = new Student();
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }

        }
    }

}
