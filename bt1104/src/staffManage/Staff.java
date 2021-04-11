package staffManage;

public class Staff {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String mail;
    public static int lastID=0;
    public static int totalStaff=0;

    public Staff(int id, String name, int age, String phoneNumber, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public Staff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String kindStaff(){
        return "staff ??";
    }

    @Override
    public String toString() {
        return kindStaff()+"{" +
                "id=" + id +
                ", name='" + name  +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber  +
                ", mail='" + mail  +
                '}';
    }
}
