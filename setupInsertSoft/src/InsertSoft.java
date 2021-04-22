public class InsertSoft {
    public static int[] insertSoft(int[] list){
        for (int i = 1; i < list.length; i++) {
            int position = i;
            int x = list[position];
            while (position>0&&x < list[position-1]){
                list[position] = list[position-1];
                position--;
            }
            list[position]=x;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list ={4,1,2,6,3,5};
        System.out.println("truoc khi sap xep");
        displayList(list);
        list=insertSoft(list);
        System.out.println("sau khi sap sep");
        displayList(list);
    }

    private static void displayList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
