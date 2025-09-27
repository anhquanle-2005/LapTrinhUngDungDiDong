

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds_133;

    public QuanLy() {
        ds_133 = new ArrayList<TheMuon>(10);
    }

    public void themTheMuon(TheMuon theMuon_133) {
        ds_133.add(theMuon_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        TheMuon theMuon_133;

        System.out.print("Nhap vao so luong the muon: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("The muon thu " + (i_133 + 1) + " la:");
            theMuon_133 = new TheMuon();
            theMuon_133.nhapThongTin(sc_133);
            themTheMuon(theMuon_133);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the_133 : ds_133) {
            if (the_133.getHanTra().getDate() == 31 || the_133.getHanTra().getDate() == 30) {
                the_133.hienThiThongTin();
            }
        }
    }
}