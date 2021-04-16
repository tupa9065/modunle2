import java.util.HashMap;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        String st = "bong da la mon the thao so 1";
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        System.out.println(map1);
        for (int i=0;i<st.length();i++){
            if (map1.containsKey(st.charAt(i))){
                map1.replace(st.charAt(i), map1.get(st.charAt(i))+1);
            } else {
                map1.put(st.charAt(i), 1);
            }
        }
        System.out.println(map1);
    }
}
