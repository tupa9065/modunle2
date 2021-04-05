import java.util.Scanner;

public class undoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        for(int i = 0 ; i<array.length; i++){
            System.out.println("enter number "+i);
            array[i]= sc.nextInt();
        }
        System.out.print( "Elements in array: ");
        for(int i : array){
            System.out.print(i+", ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("\n Reverse array: ");
        for(int i : array){
            System.out.print(i+", ");
        }
    }
}
