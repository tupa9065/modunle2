public class InsertSoft {
    public static void main(String[] args) {
        int[] list= {(int) Math.floor(Math.random()*100),(int) Math.floor(Math.random()*100),(int) Math.floor(Math.random()*100),(int) Math.floor(Math.random()*100)};
        display(list);
        for (int i = 1; i < list.length; i++) {
            int position = i;
            int x = list[position];
            System.out.println("x= "+x);
            while (position>0&&x < list[position-1]){
                list[position] = list[position-1];
                position--;
                display(list);


            }
            list[position]=x;
            display(list);
        }
    }

    private static void display(int[] list) {
        for (int i :
                list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
