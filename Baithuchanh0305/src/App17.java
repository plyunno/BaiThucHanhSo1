import java.util.ArrayList;
public class App17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(7);
        a.add(1);
        a.add(9);
        System.out.println("Các phần tử có trong arrListInteger là : ");
        for (int number : a ) {
            System.out.print(number + "\t");
        }
    }
}