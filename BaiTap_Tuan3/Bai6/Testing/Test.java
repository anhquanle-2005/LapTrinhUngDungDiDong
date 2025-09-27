

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);
        KhachSan ql_133 = new KhachSan();

        ql_133.nhapDanhSach(sc_133);
        ql_133.hienThiDanhSach();

        System.out.print("\nNhap vao CMND khach tro can tinh tien: ");
        int cmnd_133 = sc_133.nextInt();

        double tongTien_133 = ql_133.tinhTien(cmnd_133);

        if (tongTien_133 > 0) {
            System.out.println("==> Tong tien la: " + tongTien_133);
        }

        sc_133.close();
    }
}