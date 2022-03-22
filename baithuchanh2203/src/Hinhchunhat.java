import java.util.Scanner;
 
public class Hinhchunhat {

    public static void main(String[] args) {
        Hinhchunhat hcn= new Hinhchunhat();
        hcn.NhapKichThuocHCN();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
    }
    float cd;
    float cr;
    float cv;
    float dt;
    Scanner scanner = new Scanner(System.in);
    public void NhapKichThuocHCN() {
        System.out.println("Hay nhap chieu dai: ");
        cd = scanner.nextFloat();
        System.out.println("Hay nhap chieu rong: ");
        cr = scanner.nextFloat();
    }
    void tinhchuvi(){
        cv = (cd + cr)*2;
    }
    void tinhdientich(){
        dt = cd * cr;
    }
    void inchuvi(){
        System.out.printf("chu vi hinh chu nhat: " + cv);
    }
    void indientich(){
        System.out.printf("dien tich hinh chu nhat: " + dt);
    }
    
}