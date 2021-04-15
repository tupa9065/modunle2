public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);
        listInteger.add(4);

        for (int i = 0; i < listInteger.size; i++) {
            int element = i+1;
            System.out.println("element "+element+": "+listInteger.get(i));
        }

        System.out.println(listInteger.get(15));

    }
}
