public class matrix {
    static int total(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    static void timSoChan(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
            System.out.println("cột " + j + " có " + count + " số chẵn");

        }
    }

    public static void main(String[] args) {
        int[][] number = {{1, 8, 6, 5}, {3, 4, 1, 2}};
        int a = total(number);
        System.out.println("total sum element in array : "+a);
        timSoChan(number);
    }
}
