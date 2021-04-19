package bai2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Family {
    private String homeNumber;
    private HashMap<String,Person> member = new HashMap();

    public Family(String homeNumber, HashMap<String, Person> member) {
        this.homeNumber = homeNumber;
        this.member = member;
    }

    public Family() {
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public HashMap<String, Person> getMember() {
        return member;
    }

    public void setMember(HashMap<String, Person> member) {
        this.member = member;
    }
    public void addMember(){
        Person person =new Person();
        person.setInfoPerson();
        System.out.println("role in the family");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        member.put(key,person);
    }
    public String searchMemberByName(String name){
        Set<String> keys=member.keySet();
        for (String key:keys) {
            if (name.equals(member.get(key).getName())){
                return key;
            }
        }
        return null;
    }
    public Person deleteMemberByName(String name){
        String key = searchMemberByName(name);
        if (key!= null){
                return member.remove(key);
            }
        return null;
    }

    @Override
    public String toString() {
        return "Family{" +
                "homeNumber='" + homeNumber + '\'' +
                ", member=" + member +
                '}';
    }
    public void setInfoFamily(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("home number");
        setHomeNumber(scanner.nextLine());
        System.out.println("Amount of people");
        int amount=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amount; i++) {
            addMember();
        }
    }
    public Person editInfoPersonByName(String name){
        String key = searchMemberByName(name);
        if (key!= null){
            Person person = new Person();
            person.setInfoPerson();
            return member.replace(key,person);
        }
        return  null;
    }
}

