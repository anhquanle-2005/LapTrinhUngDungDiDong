

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds_133;

    public QuanLy() {
        ds_133 = new ArrayList<BienLai>(10);
    }

    public void themBienLai(BienLai bienLai_133) {
        ds_133.add(bienLai_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        BienLai bienLai_133;
        System.out.print("Nhap vao so luong bien lai: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("Bien lai thu " + (i_133 + 1) + " la:");
            bienLai_133 = new BienLai();
            bienLai_133.nhapThongTin(sc_133);

            themBienLai(bienLai_133);
        }
    }

    public void hienThiDanhSach() {
        for (int i_133 = 0; i_133 < ds_133.size(); i_133++) {
            System.out.println("Bien lai thu " + (i_133 + 1) + " la:");
            ds_133.get(i_133).hienThiThongTin();
            System.out.println();
        }
    }
}