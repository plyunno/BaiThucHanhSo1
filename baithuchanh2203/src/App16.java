import java.util.Scanner;

public class App16{
    public static void main(String[] args) throws Exception {
        Hinhtron ht= new Hinhtron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
    }
}
class Hinhtron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    void nhapbankinh(){
        System.out.println("Hay nhap vao ban kinh hinh tron");
        Scanner scanner= new Scanner(System.in);
        r = scanner.nextFloat();
        scanner.close();
        
    }
    void tinhchuvi(){
        cv = 2 * PI * r;
    }
    void tinhdientich(){
        dt = PI * r * r;
    }
    void inchuvi(){
        System.out.printf("chu vi hinh tron: " + cv);
    }
    void indientich(){
    System.out.println("dientichhinh tron: " + dt);
    }
    
}
