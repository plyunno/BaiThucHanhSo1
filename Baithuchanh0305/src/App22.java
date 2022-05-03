import java.util.ArrayList;
import java.util.Scanner;
public class App22 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Integer> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua Arraylist: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = scanner.nextInt();
            a.add(number);
        }

        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " +max);
    }
}