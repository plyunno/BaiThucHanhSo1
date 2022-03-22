public class App2203 {
    private static String cv;
    private static String dt;

    public static void main(String[] args) throws Exception {
        System.out.println("Bai_1");
        Hinhchunhat hcn= new Hinhchunhat();
        hcn.NhapKichThuocHCN();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        System.out.println("chu vi hcn la: "  +cv);
        System.out.println("Dien tich Hinh Chu Nhat : " + dt);

        System.out.println("Bai_2");
        person ps = new person();
        ps.nhapPersonName();
        ps.nhapPersonID();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inThongTin();

        System.out.println("Bai_3");
        SinhVien sv = new SinhVien();

        sv.nhapdulieu();
        sv.inDiaChi();
        sv.inHoTen();
        sv.inMaSinhVien();
        sv.inNgaySinh();
        sv.ingioiTinh();

        System.out.println("Bai_4");
        Phuongtrinhbachai pt = new Phuongtrinhbachai();
        pt.nhapsolieu();
        pt.tinhdelta();
        pt.indelta();
        pt.giaiptb2();

    }
}