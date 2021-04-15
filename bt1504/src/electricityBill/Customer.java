package electricityBill;

import java.util.Scanner;

public class Customer {
    private String name,apaNumber,codeMeter;

    public Customer(String name, String apaNumber, String codeMeter) {
        this.name = name;
        this.apaNumber = apaNumber;
        this.codeMeter = codeMeter;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApaNumber() {
        return apaNumber;
    }

    public void setApaNumber(String apaNumber) {
        this.apaNumber = apaNumber;
    }

    public String getCodeMeter() {
        return codeMeter;
    }

    public void setCodeMeter(String codeMeter) {
        this.codeMeter = codeMeter;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name +
                "' , apaNumber='" + apaNumber +
                "', codeMeter='" + codeMeter +
                "'}";
    }
    public Customer insertInfoCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name");
        this.setName(scanner.nextLine());
        System.out.println("apaNumber");
        this.setApaNumber(scanner.nextLine());
        System.out.println("codeMeter");
        this.setCodeMeter(scanner.nextLine());
        return this;
    }
}
