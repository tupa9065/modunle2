import java.io.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        readFromFile(students);
        students.add(new Student("Vu",3));
        writeToFile(students);
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }

    private static void readFromFile(ArrayList<Student> students) throws IOException {
        try{
            FileReader fileReader = new FileReader("student.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try{
                    String[] splitData = line.split(",");
                    students.add(new Student(splitData[1], Integer.parseInt(splitData[2])));
                }catch (Exception e){
                    System.out.println("trong file co dong trang hoac cau truc khong dung");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void writeToFile(ArrayList<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter("student.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students
        ) {
            bufferedWriter.write(student.toString());
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    private static void add5Student(ArrayList<Student> students) {
        Student student1 = new Student("nam", 1);
        Student student2 = new Student("hai", 1);
        Student student3 = new Student("hoang", 2);
        Student student4 = new Student("bac", 2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }
}
