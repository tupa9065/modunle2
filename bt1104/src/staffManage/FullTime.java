package staffManage;

public class FullTime extends Staff{
    private int bonus=0;
    private int fines=0;
    private int salary=0;
    public static int totalSFT=0;
    public FullTime(int id, String name, int age, String phoneNumber, String mail, int bonus, int fines, int salary) {
        super(id, name, age, phoneNumber, mail);
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }

    public FullTime(int bonus, int fines, int salary) {
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }
    public FullTime(){}

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getTotalSalary(){
        return salary+bonus-fines;
    }
    @Override
    public String toString() {
        return kindStaff()+"{" +
                "id=" + super.getId() +
                ", name='" + super.getName()  +
                ", age=" + super.getAge() +
                ", phoneNumber='" + super.getPhoneNumber()  +
                ", mail='" + super.getMail()  +
                ", salary='" + salary  +
                ", bonus='" + bonus  +
                ", fines='" + fines  +
                '}';
    }
    public String kindStaff(){
        return "staff full time";
    }

}
