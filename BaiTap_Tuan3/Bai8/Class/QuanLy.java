

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds_133;

    public QuanLy() {
        ds_133 = new ArrayList<CBGV>(10);
    }

    public void themCBGV(CBGV canBo_133) {
        ds_133.add(canBo_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        CBGV canBo_133;

        System.out.print("Nhap vao so luong can bo: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("Can bo thu " + (i_133 + 1) + " la:");
            canBo_133 = new CBGV();
            canBo_133.nhapThongTin(sc_133);
            themCBGV(canBo_133);
        }
    }

    public void hienThiDanhSach() {
        for (CBGV cb_133 : ds_133) {
            cb_133.hienThiThongTin();
        }
    }

    public void timKiem(double luong_133) {
        for (CBGV cb_133 : ds_133) {
            if (cb_133.getLuongThucLinh() >= luong_133) {
                cb_133.hienThiThongTin();
            }
        }
    }
}