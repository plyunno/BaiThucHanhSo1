import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('b');
        a.add('c');
        ListIterator<Character> listIterator = a.listIterator();
        System.out.println("Cac phan tu co trong arrListChar la : ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
    }
}