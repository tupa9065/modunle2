package hotel;

import java.util.Scanner;

public class Person {
    private String name,dob,cmt;

    public Person() {
    }

    public Person(String name, String dob, String cmt) {
        this.name = name;
        this.dob = dob;
        this.cmt = cmt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name +
                ", dob='" + dob +
                ", cmt='" + cmt  +
                '}';
    }
    public Person insertPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        this.setName(scanner.nextLine());
        System.out.println("DOB");
        this.setDob(scanner.nextLine());
        System.out.println("CMT");
        this.setCmt(scanner.nextLine());
        return this;
    }
}
