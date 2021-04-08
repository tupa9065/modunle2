package abc;

import java.util.Scanner;

public class bt0604 {
    static void displayStudentList(String[][] arr) {
        for (String[] i : arr) {
            System.out.println();
            int count = 0;
            for (String j : i) {
                switch (count) {
                    case 0: {
                        System.out.print("ID:");
                        break;
                    }
                    case 1: {
                        System.out.print("Name: ");
                        break;
                    }
                    case 2: {
                        System.out.print("Brithday: ");
                        break;
                    }
                    case 3: {
                        System.out.print("Score: ");
                        break;
                    }
                }
                System.out.print(j+" ||");
                count++;
            }

        }
    }

    static String[][] addStudent(String[] newStudent, String[][] student) {
        String[][] addArrayStudent = new String[student.length + 1][4];
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                addArrayStudent[i][j] = student[i][j];
            }
        }
        for (int j = 0; j < 4; j++) {
            addArrayStudent[student.length][j] = newStudent[j];
        }
        return addArrayStudent;
    }

    static String[][] editStudent(String id, String[][] student) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals(id)) {
                index = i;
                break;
            }
        }
        System.out.print("name:");
        student[index][1] = sc.next();
        System.out.print("birthday:");
        student[index][2] = sc.next();
        System.out.print("Score:");
        student[index][3] = sc.next();
        return student;
    }
    static String[][] deleteStudent(String id,String[][] student){
        String[][] newArrayStudent = new String[student.length-1][4];
        int index = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals(id)) {
                index = i;
                break;
            }
        }
        for(int i =0 ; i<index;i++){
            for (int j =0 ; j<student[i].length;j++){
                newArrayStudent[i][j]=student[i][j];
            }
        }
        for(int i =index ; i<newArrayStudent.length;i++){
            for (int j =0 ; j<student[i].length;j++){
                newArrayStudent[i][j]=student[i+1][j];
            }
        }

        return newArrayStudent;
    }
    static String topScore(String[][] student){
        double max= Double.parseDouble(student[0][3]);
        int index=0;
        for (int i =1 ; i< student.length;i++){
            if(Double.parseDouble(student[i][3])>max){
                max=Double.parseDouble(student[i][3]);
                index=i;
            }
        }
        return student[index][1];
    }
    static void sortByScore(String[][] student){
        for (int i =0 ; i< student.length;i++){
            for(int j =i+1;j< student.length;j++){
                if(Double.parseDouble(student[i][3])<Double.parseDouble(student[j][3])){
                    String [] temp ={student[i][0],student[i][1],student[i][2],student[i][3]};
                    for(int k=0 ;k<4;k++){
                        student[i][k]=student[j][k];
                    }
                    for(int k=0 ;k<4;k++){
                        student[j][k]=temp[k];
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String[][] student = {{"1", "tu", "91", "9.0"}, {"2", "tuan", "96", "9.5"}, {"3", "thanh", "96", "9.7"},};
        //displayStudentList(student);
        String[] vu = {"4", "vu", "94", "10"};
        String[][] student2 = addStudent(vu, student);
        //displayStudentList(student2);
        String[] kien = {"5", "kien", "99", "11"};
        String[][] student3 = addStudent(kien, student2);
        //displayStudentList(student3);
        //student = editStudent("1",student);
        //displayStudentList(student3);
       // String[][] studentDelete = deleteStudent("2",student);
        //displayStudentList(studentDelete);
        String topScore=topScore(student3);
        //System.out.println("Student have top score is :"+topScore);
        sortByScore(student3);
        displayStudentList(student3);

    }

}
