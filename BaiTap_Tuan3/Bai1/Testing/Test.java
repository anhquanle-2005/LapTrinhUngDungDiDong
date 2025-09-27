package Bai1.Testing;

import java.util.Scanner;
import Class.PhanSo;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1_133 = new PhanSo();
        PhanSo ps2_133 = new PhanSo();

        System.out.println("Nhap vao phan so thu nhat:");
        ps1_133.nhapPS(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_133.nhapPS(sc);
        PhanSo psTong_133 = ps1_133.congPS(ps2_133);
        PhanSo psHieu_133 = ps1_133.truPS(ps2_133);
        PhanSo psTich_133 = ps1_133.nhanPS(ps2_133);
        PhanSo psThuong_133 = ps1_133.chiaPS(ps2_133);
        System.out.println("\nPhan so thu nhat la:");
        ps1_133.hienThiPS();
        System.out.println("Phan so thu hai la:");
        ps2_133.hienThiPS();
        System.out.println("\nTong hai phan so:");
        psTong_133.hienThiPS();
        System.out.println("Hieu hai phan so:");
        psHieu_133.hienThiPS();
        System.out.println("Tich hai phan so:");
        psTich_133.hienThiPS();
        System.out.println("Thuong hai phan so:");
        psThuong_133.hienThiPS();

        sc.close();
    }
}
