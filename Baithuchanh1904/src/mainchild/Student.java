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
}
