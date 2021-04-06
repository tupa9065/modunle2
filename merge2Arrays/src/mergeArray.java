public class mergeArray {
    public static void main(String[] args) {
        int [] num1={1,2,3};
        int [] num2={4,5,6};
        int [] num3= new int[num1.length+ num2.length];
        int i =0;
        for (int n:num1) {
            num3[i] =n;
            i++;
        }
        for (int n:num2) {
            num3[i]=n;
            i++;
        }
        for (int n:num3) {
            System.out.print(n+", ");
        }
    }
}
