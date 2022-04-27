import Shape.Point;
import Shape.Quadrilateral;
// import Shape.Quadrilateral;
import Shape.Triangle;
public class App2604 {
    public static void main(String[] args) throws Exception {
        
        Point p = new Point();
        p.nhaptenDiem();
        p.nhapHoanhDo();
        p.nhapTungDo();
        p.inDiem();
        Triangle A = new Triangle();
        Triangle B = new Triangle();
        Triangle C = new Triangle();
        A.nhapToaDo();
        // A.inToaDo();
        A.tinhDoDai();

        B.nhapToaDo();
        // B.inToaDo();
        B.tinhDoDai();

        C.nhapToaDo();
        // C.inToaDo();
        C.tinhDoDai();

        Quadrilateral q = new Quadrilateral();
        q.nhapTuGiac();
        q.kiemTraTuGiac();
        q.kiemTraLoaiTuGiac();
}
}