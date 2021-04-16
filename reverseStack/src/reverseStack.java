import java.util.Arrays;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        reverseInt();

        reverseStr();


    }

    private static void reverseStr() {
        String str="thiên hạ vô địch";
        Stack<Character> wStack = new Stack<>();
        char[] arraysStr = str.toCharArray();
        for (char i:arraysStr) {
            wStack.push(i);
        }
        String reverseStr="";
        for (char i:arraysStr) {
            reverseStr +=wStack.pop();
        }
        System.out.println(str);
        System.out.println(reverseStr);
    }

    private static void reverseInt() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        int[] arraysInt = new int[stack.size()];
        int index=0;
        for (int i:stack) {
            arraysInt[index]=i;
            index++;
        }
        stack.clear();
        for (int i=arraysInt.length-1;i>=0;i--) {
            stack.push(arraysInt[i]);
        }
        System.out.println(stack);
    }
}
