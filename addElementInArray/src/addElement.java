public class addElement {
    static int [] addE(int n,int index,int[] arrNum){
        int[] newArrNum = new int[arrNum.length+1];
        for(int i = 0 ; i < index ; i++){
            newArrNum[i]=arrNum[i];
        }
        newArrNum[index]=n;
        for (int i = index+1;i< arrNum.length+1;i++){
            newArrNum[i]=arrNum[i-1];
        }

        return newArrNum;
    }
    public static void main(String[] args) {
        int [] arrNum={1,2,3,4,5,6,7,8,1,9};
        System.out.println("array before add element:");
        for (int i:arrNum) {
            System.out.print(i+", ");
        }
        int [] newArr = addE(10,3,arrNum);
        System.out.println("array before add element:");
        for (int i:newArr) {
            System.out.print(i+", ");
        }

    }
}
