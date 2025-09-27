package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh_133;
    private int thangPhatHanh_133;

    public TapChi() {

    }

    public TapChi(String maTaiLieu_133, String tenNXB_133, int soBanPhatHanh_133, int soPhatHanh_133, int thangPhatHanh_133) {
        super(maTaiLieu_133, tenNXB_133, soBanPhatHanh_133);
        this.soPhatHanh_133 = soPhatHanh_133;
        this.thangPhatHanh_133 = thangPhatHanh_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap so phat hanh: ");
        this.soPhatHanh_133 = sc_133.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        this.thangPhatHanh_133 = sc_133.nextInt();
        sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + this.soPhatHanh_133);
        System.out.println("\tThang phat hanh: " + this.thangPhatHanh_133);
    }
}