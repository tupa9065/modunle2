package managerStudent;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private float score;
    public static int latID =2;


    Student(int id,String name, String birthday,float score){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
        this.score=score;
    }

    public Student() {

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", score=" + score +
                '}';
    }
}
