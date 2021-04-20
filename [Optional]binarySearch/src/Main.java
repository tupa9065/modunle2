import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(9);
        integers.add(8);
        integers.add(-6);
        integers.add(5);
        integers.add(-4);
        integers.add(0);
        Collections.sort(integers);
        int i =binarySearch(integers,0,integers.size()-1,12);
        int j =binarySearch(integers,0,integers.size()-1,8);
        System.out.println(i+","+j);

    }
    public static int binarySearch( List<Integer> array, int left, int right ,int value){
        int middle = (left + right)/2;
        if(left>right){
            return  -1;
        }
        if(array.get(middle)==value){
            return value;
        }else if(array.get(middle)<value){
            left=middle+1;
           return binarySearch(array,left,right,value);
        }else {
            right=middle-1;
          return binarySearch(array,left,right,value);
        }
    }
}

