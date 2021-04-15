package electricityBill;

import java.util.Scanner;

public class Bill {
    private int newIndex,oldIndex;
    private Customer customer =new Customer();
    private final int ePrice=750;

    public Bill() {
    }

    public Bill(int newIndex, int oldIndex, Customer customer) {
        this.newIndex = newIndex;
        this.oldIndex = oldIndex;
        this.customer = customer;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "newIndex=" + newIndex +
                ", oldIndex=" + oldIndex +
                ", customer=" + customer +
                ", ePrice=" + ePrice +
                '}';
    }
    public int getPay(){
        return (newIndex-oldIndex)*ePrice;
    }
    public Bill insertInfoBill(){
        Scanner scanner = new Scanner(System.in);
        customer.insertInfoCustomer();
        System.out.println("oldIndex");
        this.setOldIndex(scanner.nextInt());
        System.out.println("newIndex");
        this.setNewIndex(scanner.nextInt());
        return this;
    }

}
