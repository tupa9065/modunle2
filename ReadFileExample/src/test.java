import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {

        File fd = new File("C:\\Users\\Admin\\Desktop\\module 2\\1 New FD");
        fd.mkdir();
        System.out.println(fd.getAbsolutePath());
        System.out.println(fd.getName());
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("stt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
