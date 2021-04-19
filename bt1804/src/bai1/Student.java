package bai1;

import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private String birthDay;
    private String classID;
    Scanner scanner = new Scanner(System.in);
    public Student(String name, String id, String birthDay, String numClass) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
        this.classID = numClass;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", numClass='" + classID + '\'' +
                '}';
    }
    public void insertStudent(){

        System.out.println("Name");
        this.setName(scanner.nextLine());
        System.out.println("Student ID");
        this.setId(scanner.nextLine());
        System.out.println("Date of Birth");
        this.setBirthDay(scanner.nextLine());
        System.out.println("Class");
        this.setClassID(scanner.nextLine());
    }
}
