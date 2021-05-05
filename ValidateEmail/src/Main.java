import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] emails = {"abc@xyz.com", "abc.com", "abc@xyz"};
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < emails.length; i++) {
            matcher= pattern.matcher(emails[i]);
            if(matcher.find()){
                System.out.println(emails[i]);
            }
        }
    }
}
