import java.util.Scanner;

public class Student {
    private int id ;
    private String name;
    private int classNumber;
    static int count=0;

    public Student() {
        id=++count;
    }

    public Student(String name, int classNumber) {
        this.name = name;
        this.classNumber = classNumber;
        id=++count;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return id+","+name+","+classNumber;
    }
    public void inputInfoStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        name=scanner.nextLine();
        System.out.println("class");
        classNumber=Integer.parseInt(scanner.nextLine());
    }
}
