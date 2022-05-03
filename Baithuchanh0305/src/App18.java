import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Float> a = new ArrayList<>();
        a.add(0.7f);
        a.add(7.26f);
        a.add(1.02f);
        a.add(9.3f);
        Iterator<Float> iterator = a.iterator();

        System.out.println("Cac phan tu co trong arrListFloat : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}