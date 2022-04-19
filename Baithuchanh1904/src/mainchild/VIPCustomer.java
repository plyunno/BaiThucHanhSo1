package mainchild;

import java.util.Scanner;

public class VIPCustomer extends Person{
    
    public String VIPCustomerEmail; 
    public String VIPCustomerName;
    public String Address;
    public int Discount;
    Scanner sc = new Scanner(System.in);

    public VIPCustomer(){}

    public VIPCustomer(String none, int age, String address, String name, int Discount){
        this.Discount = Discount;
    }

    public void nhapVIPCustomerEmail(){
        System.out.println("Hay nhap VIPCustomerEmail ");
        Scanner sc = new Scanner(System.in);
        VIPCustomerEmail = sc.nextLine();
        sc.close();
    }

    public void nhapVIPCustomerName() {
       System.out.println("nhap ten:");
        Scanner sc = new Scanner(System.in);
        VIPCustomerName = sc.nextLine();
        sc.close();
    }

    public void nhapAddress() {
        System.out.println("Hay nhap Address ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        sc.close();
    }
}
