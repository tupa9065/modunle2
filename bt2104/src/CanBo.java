import java.util.Scanner;

public class CanBo {
    private String name;
    private int dateOfBirth;
    private String homeTown;

    public CanBo() {
    }

    public CanBo(String name, int dateOfBirth, String homeTown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "info{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
    public  void insertInfoCanBo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        name= scanner.nextLine();
        System.out.println("DOB");
        dateOfBirth= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Home town");
        homeTown= scanner.nextLine();
    }
}
