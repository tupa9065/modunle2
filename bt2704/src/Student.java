import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable
{
    private int id,classNumber,math;
    private String name,homeTown;

    public Student() {
    }

    public Student(int id, int classNumber, int math, String name, String homeTown) {
        this.id = id;
        this.classNumber = classNumber;
        this.math = math;
        this.name = name;
        this.homeTown = homeTown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", classNumber=" + classNumber +
                ", math=" + math +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }

}
