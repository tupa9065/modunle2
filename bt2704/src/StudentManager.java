import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class StudentManager {

    public void inputInfoStudent(Student student){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        int id=Integer.parseInt(scanner.nextLine());
        student.setId(id);
        System.out.println("Name");
        String name=scanner.nextLine();
        student.setName(name);
        System.out.println("Home town");
        String homeTown=scanner.nextLine();
        student.setHomeTown(homeTown);
        System.out.println("Class");
        int classNumber=Integer.parseInt(scanner.nextLine());
        student.setClassNumber(classNumber);
        System.out.println("Math");
        int math=Integer.parseInt(scanner.nextLine());
        student.setMath(math);
    }
    public void addStudent(ArrayList<Student> students){
        Student student = new Student();
        inputInfoStudent(student);
        students.add(student);
    }
    public void add5Student(ArrayList<Student> students){
        Student student = new Student(5,1,10,"1","1");
        Student student2 = new Student(2,1,11,"2","2");
        Student student3 = new Student(1,2,12,"3","3");
        Student student4 = new Student(4,2,1,"4","4");
        Student student5 = new Student(3,3,2,"5","5");
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
    }
    public void displayStudentList(ArrayList<Student> students){
        System.out.println("=============================================");
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }
    public ArrayList<Student> sortStudentListByID(ArrayList<Student> students){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                }
                return -1;

            }
        });
        return students;
    }
    public Student findStudentByID(int id,ArrayList<Student> students){
        sortStudentListByID(students);
        int left = 0;
        int right = students.size();
        while (left>=right){
            int mid = (left+right)/2;
            if(id == students.get(mid).getId()){
                return students.get(mid);
            }
            if (id > students.get(mid).getId()){
                left=mid+1;
            }else {
                right=mid-1;
            }

        }
        return null;
    }
    public ArrayList<Student> sortStudentListByMath(ArrayList<Student> students){
        for (int i = 0; i < students.size()-1; i++) {
            for (int j = i+1 ;j< students.size();j++) {
                if(students.get(i).getMath()<students.get(j).getMath()){
                    Collections.swap(students,i,j);
                }

            }
        }
        return students;
    }
    public ArrayList<Student> top3Student(ArrayList<Student> students){
        ArrayList<Student> topStudents = new ArrayList<>();
        if(students.size()<3){
            return students;
        }else {
            for (int i = 0; i < 3; i++) {
                topStudents.add(students.get(i));
            }
        }
        return topStudents;
    }
    public Map<Integer,Integer> numberStudentInClass(ArrayList<Student> students){
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            int key =students.get(i).getClassNumber();
            if(numbers.containsKey(key)){
                numbers.replace(key,numbers.get(key)+1);
            }else {
                numbers.put(key,1);
            }
        }
        return numbers;
    }
    public void writeToFile(ArrayList<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Student> readDataFromFile(){
        ArrayList<Student> newStudentsList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            newStudentsList= (ArrayList<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newStudentsList;
    }

}
