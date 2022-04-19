package main;

import mainchild.Person;
import mainchild.Student;
import mainchild.Employee;
import mainchild.Customer;
import mainchild.VIPCustomer;
import mainchild.Studentt.OfflineStudent;
import mainchild.Studentt.OnlineStudent;
import mainchild.Eployee.PartTime;
import mainchild.Eployee.FullTime;

public class mainClass{
    
    public static void main(String[] args) {
        Person per = new Person();
        per.hienThiThongTin();

        Employee em = new Employee();
        em.hienThiThongTin();

        Student stu = new Student();
        stu.display();

        OnlineStudent onl = new OnlineStudent();
        onl.trangthaiStudent();
        OfflineStudent off = new OfflineStudent();
        off.loaiStudent();

        Customer cus = new Customer();
        cus.nhapEmail();
        cus.nhapName();
        cus.nhapAddress();
        VIPCustomer vip = new VIPCustomer();
        vip.hienThiThongTin();

        PartTime parttime = new PartTime();
        parttime.totalSalary();
        FullTime fulltime = new FullTime();
        fulltime.totalSalary();
}
}