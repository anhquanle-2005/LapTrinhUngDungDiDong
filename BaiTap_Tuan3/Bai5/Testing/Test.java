package Testing;

import java.util.Scanner;
import Class.KhuPho;

public class Test {
    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);
        KhuPho qlkp_133 = new KhuPho();

        qlkp_133.nhapDanhSach(sc_133);
        
        System.out.println("\n--- DANH SACH TOAN BO KHU PHO ---");
        qlkp_133.hienThiDanhSach();

        qlkp_133.timNguoiMungTho80();
        
        sc_133.close();
    }
}