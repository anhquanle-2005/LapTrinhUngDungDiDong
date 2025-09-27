package Bai4.Testing;

import java.util.Scanner;
import Class.TuyenSinh;

public class Test {
    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);
        TuyenSinh dsTuyenSinh_133 = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh_133.nhapDanhSach(sc_133);

        System.out.println("\nDanh sach thi sinh du thi la:");
        dsTuyenSinh_133.hienThiDanhSach();

        System.out.print("\nNhap so bao danh can tim: ");
        int soBaoDanh_133 = sc_133.nextInt();
        sc_133.nextLine();

        dsTuyenSinh_133.timKiemThiSinh(soBaoDanh_133);

        sc_133.close();
    }
}