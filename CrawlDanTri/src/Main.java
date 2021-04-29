import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static URL url;

    public static void main(String[] args) {
        try {
             url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner( new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            scanner.close();
            content=content.replaceAll("\\n+","");
            String str="title=\"(.*?)\"";
            Pattern pattern = Pattern.compile(str);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
