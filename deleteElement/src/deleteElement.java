public class deleteElement {
    static int [] deleteE(int n,int[] arrNum){
        int[] newArrNum;
        int count =0;
        for (int i =0,j=i;i<arrNum.length;i++){
            if(n != arrNum[i]){
                arrNum[j]=arrNum[i];
                j++;
            }else {
                count++;
            }
        }
        newArrNum = new int[arrNum.length-count];
        for (int i =0; i < newArrNum.length;i++){
            newArrNum[i]=arrNum[i];
        }
        return newArrNum;
    }
    public static void main(String[] args) {
        int [] arrNum={1,2,3,4,5,6,7,8,1,9};
        System.out.println("array before delete element:");
        for (int i:arrNum) {
            System.out.print(i+", ");
        }
        int[] newArr=deleteE(1,arrNum);
        System.out.println("\n array after delete element:");
        for (int i:newArr) {
            System.out.print(i+", ");
        }
    }
}
