import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<String> a = new ArrayList<>();
        a.add("0");
        a.add("1");
        a.add("2");
        a.add("3");
        System.out.println(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
