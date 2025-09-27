
import java.util.Scanner;



public class Test {

    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);

        QuanLy ql_133 = new QuanLy();

        ql_133.nhapDanhSach(sc_133);

        System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
        ql_133.hienThiDanhSachTraCuoiThang();

        sc_133.close();
    }

}