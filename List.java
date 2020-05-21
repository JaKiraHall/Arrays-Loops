import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // int[] numbers = { 2, 42, 7, 8 };
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(42);
        list.add(7);
        list.add(8);
        System.out.println(list.get(1));
        list.add(5);
        System.out.println(list.size());
        list.set(2, 67);
        list.remove(4);
        System.out.println(list.size());
    }
}
