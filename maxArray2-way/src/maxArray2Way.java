public class maxArray2Way {
    static int maxArray2Way(int[][] arrNum){
        int max =arrNum[0][0];
        for (int[] ints : arrNum) {
            for (int j : ints) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arrNum ={{1,2,3},{6,4,3},{9,8,7}};
        int max = maxArray2Way(arrNum);
        System.out.println("max is :"+max);
    }
}
