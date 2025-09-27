package Bai2.Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {
    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);
        QLCB qlcb_133 = new QLCB();

        qlcb_133.nhapDanhSach(sc_133);
        qlcb_133.hienThiDanhSach();

        System.out.print("\nNhap vao ho ten can tim kiem: ");
        String name_133 = sc_133.nextLine();

        qlcb_133.timKiemCanBo(name_133);

        sc_133.close();
    }
}