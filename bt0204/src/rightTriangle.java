import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;
        while (ck) {
            System.out.println("enter a");
            int[] triangle = new int[3];
            int a = sc.nextInt();
            triangle[0] = a;
            System.out.println("enter b");
            int b = sc.nextInt();
            triangle[1] = b;
            System.out.println("enter c");
            int c = sc.nextInt();
            triangle[2] = c;
            // tìm ra cạnh lớn nhất là cạnh huyền
            int max = triangle[0];
            for (int i = 1; i < triangle.length; i++) {
                if (triangle[i] > max) {
                    max = triangle[i];
                }
            }
            // xóa cạnh huyền trong mảng để còn lại 2 cạnh góc vuông
            int i, j;
            for (j = i = 0; i < triangle.length; i++) {
                if (triangle[i] != max) {
                    triangle[j] = triangle[i];
                    j++;
                }
            }
            //xét điều kiện các cạnh của tam giác
            if (a + b > c && a + c > b && c + b > a) {
                if (Math.pow(max, 2) == Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2)) {
                    System.out.printf("a = %d, b= %d, c= %d is edge of RIGHT triangle", a, b, c);
                } else {
                    System.out.printf("a = %d, b= %d, c= %d is edge of NORMAL triangle ", a, b, c);
                }

            } else {
                System.out.printf("a = %d, b= %d, c= %d IS NOT edge of triangle ", a, b, c);
            }
            System.out.println("\n press 1 to stop program");
            int stop = sc.nextInt();
            if (stop == 1) {
                ck = false;
            }

        }
    }
}
