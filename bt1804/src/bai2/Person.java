package bai2;

import com.sun.deploy.security.SandboxSecurity;

import java.util.Scanner;

public class Person {
    private String name;
    private int dateOfBirth;
    private String job;
    Scanner scanner = new Scanner(System.in);
    public Person() {
    }

    public Person(String name, int dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
    public void setInfoPerson(){
        System.out.println("name");
        this.setName(scanner.nextLine());
        System.out.println("date of birth");
        this.setDateOfBirth(scanner.nextInt());
        scanner.nextLine();
        System.out.println("job");
        this.setJob(scanner.nextLine());
    }
}
