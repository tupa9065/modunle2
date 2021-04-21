import java.util.Scanner;

public class GiaoVien extends CanBo{
    private int salary,deduction,bonus;

    public GiaoVien(int salary, int deduction, int bonus) {
        this.salary = salary;
        this.deduction = deduction;
        this.bonus = bonus;
    }

    public GiaoVien(String name, int dateOfBirth, String homeTown, int salary, int deduction, int bonus) {
        super(name, dateOfBirth, homeTown);
        this.salary = salary;
        this.deduction = deduction;
        this.bonus = bonus;
    }
    public GiaoVien(){
        salary=0;bonus=0;deduction=0;
    };

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                super.toString()+
                "salary=" + salary +
                ", deduction=" + deduction +
                ", bonus=" + bonus +
                '}';
    }
    public int getRealSalary(){
        return salary+bonus-deduction;
    }
    public void insertInfoGiaoVien(){
        Scanner scanner= new Scanner(System.in);
        super.insertInfoCanBo();
        System.out.println("Salary");
        salary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("deduction");
        deduction = scanner.nextInt();
        scanner.nextLine();
        System.out.println("bonus");
        bonus = scanner.nextInt();
        scanner.nextLine();

    }
}
