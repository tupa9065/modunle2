package staffManage;

public class PartTime extends Staff{
    private int workTime=0;
    public static int totalSPT=0;

    public PartTime(int id, String name, int age, String phoneNumber, String mail, int workTime) {
        super(id, name, age, phoneNumber, mail);
        this.workTime = workTime;
    }

    public PartTime(int workTime) {
        this.workTime = workTime;
    }
    public PartTime(){}

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
    public int getTotalSalary(){
        return workTime*100000;
    }
    @Override
    public String toString() {
        return kindStaff()+"{" +
                "id=" + super.getId() +
                ", name='" + super.getName()  +
                ", age=" + super.getAge() +
                ", phoneNumber='" + super.getPhoneNumber()  +
                ", mail='" + super.getMail()  +
                ", working time='" + workTime  +
                '}';
    }
    public String kindStaff(){
        return "staff part time";
    }


}
