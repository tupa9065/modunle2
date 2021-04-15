package hotel;

import hotel.Hotel;

import java.util.ArrayList;
import java.util.List;

public class ManageHotel {
    List<Hotel> hotels = new ArrayList<>();

    public void add() {
        Hotel hotel = new Hotel();
        hotel.insertRoomTenants();
        hotels.add(hotel);
    }

    public void display() {
        for (Hotel hotel : hotels
        ) {
            System.out.println(hotel);
        }
        System.out.println("====================================================");
    }


    public int findCMT(String cmt) {

        int index = -1;
        for (int i = 0;i < hotels.size();i++) {
            boolean isCMT = hotels.get(i).getRoomTenants().getCmt().equals(cmt);
            if (isCMT) {
                index = i;
                break;
            }

        }
        return index;
    }

    public void delete(String cmt) {
        int index = findCMT(cmt);
        if(index!=-1){
            hotels.remove(index);
            display();
        }else {
            System.out.println("not find number of CMT");
        }
    }
    public void edit(String cmt){
        int index = findCMT(cmt);
        if(index!=-1){
            System.out.println(hotels.get(index).toString());
            System.out.println("edit");
            hotels.get(index).insertRoomTenants();
            System.out.println(hotels.get(index).toString());
            System.out.println("====================================================");
        }else {
            System.out.println("not find number of CMT");
        }
    }
    public void payment(String cmt) {
        int index = findCMT(cmt);
        if(index!=-1){
            int roomChange=hotels.get(index).getRoomCharge();
            System.out.println("Room change: "+roomChange+" USD");
            System.out.println("====================================================");
        }else {
            System.out.println("not find number of CMT");
        }
    }

}
