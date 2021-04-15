package hotel;

import java.util.Scanner;

public class Hotel {
    private String kindOfRoom;
    private int priceOfRoom,dayToRent;
    private Person roomTenants = new Person();

    public Hotel() {
    }

    public Hotel(String kindOfRoom, int priceOfRoom, int dayToRent, Person roomTenants) {
        this.kindOfRoom = kindOfRoom;
        this.priceOfRoom = priceOfRoom;
        this.dayToRent = dayToRent;
        this.roomTenants = roomTenants;
    }

    public Hotel(String kindOfRoom, int priceOfRoom, int dayToRent) {
        this.kindOfRoom = kindOfRoom;
        this.priceOfRoom = priceOfRoom;
        this.dayToRent = dayToRent;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public int getDayToRent() {
        return dayToRent;
    }

    public void setDayToRent(int dayToRent) {
        this.dayToRent = dayToRent;
    }

    @Override
    public String toString() {
        return "hotel.Hotel{" +
                "kindOfRoom='" + kindOfRoom  +
                ", priceOfRoom=" + priceOfRoom +
                ", dayToRent=" + dayToRent +
                "," + roomTenants.toString() +
                '}';
    }

    public Person getRoomTenants() {
        return roomTenants;
    }

    public void setRoomTenants(Person roomTenants) {
        this.roomTenants = roomTenants;
    }
    public int getRoomCharge(){
        return priceOfRoom*dayToRent;
    }
    public Hotel insertRoomTenants(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kind:");
        this.setKindOfRoom(scanner.nextLine());
        System.out.println("price:");
        this.setPriceOfRoom(scanner.nextInt());
        System.out.println("day to rent:");
        this.setDayToRent(scanner.nextInt());
        scanner.nextLine();
        this.roomTenants.insertPerson();
        return this;
    }
}
