package electricityBill;

import java.util.ArrayList;
import java.util.List;

public class BillManager {
    List<Bill> bills = new ArrayList<>();
    public void addBill(){
        Bill bill = new Bill();
        bill.insertInfoBill();
        bills.add(bill);
    }
    public void displayBills(){
        for (Bill bill:bills) {
            System.out.println(bill);
        }
        System.out.println("=======================================");
    }
    public int findByApaNumber(String apa){
        int index = -1;
        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getCustomer().getApaNumber().equals(apa)){
                index=i;
                break;
            }

        }
        return index;
    }
    public int payByApaNumber(String apa){
        int index=findByApaNumber(apa);
        int eBill = -1;
        if(index!=-1){
            eBill= bills.get(index).getPay();
        }
        return eBill;
    }
}
