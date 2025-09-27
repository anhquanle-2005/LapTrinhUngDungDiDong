package Bai3.Testing;

import java.util.Scanner;
import Class.QuanLySach;

public class Test {
    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);
        QuanLySach qls_133 = new QuanLySach();

        qls_133.nhapDanhSachTL(sc_133);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai_133 = sc_133.nextLine();
        qls_133.timLoaiTL(loai_133);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL_133 = sc_133.nextLine();
        qls_133.timMaTL(maTL_133);

        sc_133.close();
    }
}