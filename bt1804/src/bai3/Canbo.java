package bai3;

import java.util.Scanner;

public class Canbo {
    private String name;
    private int dob;
    private String gender;
    private String address;

    public Canbo(String name, int dob, String gender, String address) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    public Canbo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void insertInfoCanBo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name");
        this.setName(scanner.nextLine());
        System.out.println("DOB");
        this.setDob(scanner.nextInt());
        scanner.nextLine();
        System.out.println("gender");
        this.setGender(scanner.nextLine());
        System.out.println("address");
        this.setAddress(scanner.nextLine());
    }
}
