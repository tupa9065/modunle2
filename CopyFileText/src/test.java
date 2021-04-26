import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        List<String> results = new ArrayList<>();
        try{
            readFileToArray(results);
            writeFlieFromArray(results);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("test");

    }

    private static void writeFlieFromArray(List<String> results) throws IOException {
        FileWriter fileWriter = new FileWriter("test2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String element: results
             ) {
            bufferedWriter.write(element+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    private static void readFileToArray(List<String> results) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()){
             System.err.println("File không tồn tại");

        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line= bufferedReader.readLine())!=null){
            results.add(line);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
