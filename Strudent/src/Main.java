import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static final String REGEX_CLASSNAME="^[CAP]\\d{4}[GHIKLM]\\d{1}$";
    public static boolean checkValidate(String str,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
    public static void main(String[] args) {
        System.out.println(checkValidate("C0221H1",REGEX_CLASSNAME));
    }
}
