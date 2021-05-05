import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentManager studentManager = new StudentManager();
        students=studentManager.readDataFromFile();
        //studentManager.add5Student(students);
        studentManager.displayStudentList(students);
        //studentManager.writeToFile(students);
//        students=studentManager.sortStudentListByID(students);
//        studentManager.displayStudentList(students);
//        students=studentManager.sortStudentListByMath(students);
//        studentManager.displayStudentList(students);
//        ArrayList<Student> topStudent =studentManager.top3Student(students);
//        studentManager.displayStudentList(topStudent);
//        Map<Integer,Integer> peopleInClass = studentManager.numberStudentInClass(students);
//        System.out.println(peopleInClass);

    }
}
