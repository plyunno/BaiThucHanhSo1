package mainchild;

public class Student extends Person{
    
    private String dob;
    private String gender;

    public Student( String masinhvien, String ten, String ngaysinh, String gioitinh, String diachi){
        this.dob=ngaysinh;
        this.PersonID=masinhvien;
        this.PersonName=ten;
        this.Address=diachi;
        this.gender=gioitinh;
    }
        
    public Student(){}
        
    public void getdob(){
        System.out.println("ngay sinh la: "+ dob);
    }

    public void getgender(){
        System.out.println("gioi tinh la: "+ gender);
    }

    public void display() {
    }

}
