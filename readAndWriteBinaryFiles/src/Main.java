import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    static void copyFileUsingStream(File source, File dest){
        InputStream is = null;
        OutputStream os = null;
        try {
            is= new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.print("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        //copyFileUsingJava7Files(sourceFile, destFile);
        copyFileUsingStream(sourceFile, destFile);
        System.out.print("Copy completed");
    }
}
