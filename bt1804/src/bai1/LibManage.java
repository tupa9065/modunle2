package bai1;

import java.util.HashMap;
import java.util.Set;

public class LibManage {
    HashMap<String,LibCard> libCardsArr = new HashMap();
    static int latsId=0;
    public void insertLibCard(){
        LibCard libCard = new LibCard();
        libCard.insertLibCard();
        libCardsArr.put(libCard.getCardID(),libCard);
    }
    public void displayLibCardArr(){
        Set<String> cardIDs = libCardsArr.keySet();
        for (String cardID:cardIDs) {
            System.out.println(libCardsArr.get(cardID));
        }
    }
    public void displayLibCard(String card){
        Set<String> cardIDs = libCardsArr.keySet();
        for (String key:cardIDs) {
            if(card.equals(key)){
                System.out.println(libCardsArr.get(key));
            }
        }
    }
    public void displayStudent(String hire){
        Set<String> cardIDs = libCardsArr.keySet();
        for (String cardID:cardIDs) {
            if(hire.equals(libCardsArr.get(cardID).getCardID())){
                System.out.println(libCardsArr.get(cardID));
            }
        }
    }
}
