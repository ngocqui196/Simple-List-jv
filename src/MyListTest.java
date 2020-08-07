public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(5);
        System.out.println("element 4" + listInteger.get(4));
        System.out.println("element 2" + listInteger.get(2));
        System.out.println("element 0" + listInteger.get(0));
        listInteger.add(14);
        listInteger.add(23);
        System.out.println("element 6" + listInteger.get(6));
    }
}
