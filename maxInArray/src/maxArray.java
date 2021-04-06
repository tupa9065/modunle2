import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for(int i =0;i<size;i++){
            System.out.print("enter number "+i+1+"'st ");
            array[i]= scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j : array) {
            System.out.print(j + ", ");
        }
        int max = array[0];
        int index=0;
        for (int i =0 ; i< array.length;i++){
            if(max<array[i]){
                max=array[i];
                index=i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }

}
