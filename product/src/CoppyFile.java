import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CoppyFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    static void copyFileUsingStream(File source, File dest){
        InputStream is = null;
        OutputStream os = null;
        int count =0;
        try {
            is= new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                count+=length;
                os.write(buffer, 0, length);
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        copyFileUsingStream( new File("product.txt"), new File("copyFile.txt"));

    }
}
