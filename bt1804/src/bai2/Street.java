package bai2;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Set;

public class Street {
    private String name;
    private HashMap<String,Family> street= new HashMap();

    public Street() {
    }

    public Street(String name, HashMap<String, Family> street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Family> getStreet() {
        return street;
    }

    public void setStreet(HashMap<String, Family> street) {
        this.street = street;
    }
    public void addFamily(){
        Family family = new Family();
        family.setInfoFamily();
        street.put(family.getHomeNumber(), family);
    }
    public void displayByDateOfBirth(int age){
        Set<String> keys= street.keySet();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (String key:keys) {
            Set<String> keysFam= street.get(key).getMember().keySet();
            for (String fam:keysFam) {
                if(thisYear-street.get(key).getMember().get(fam).getDateOfBirth()==age){
                    String name = street.get(key).getMember().get(fam).getName();
                    System.out.println(name);
                }

            }

        }

    }



}
