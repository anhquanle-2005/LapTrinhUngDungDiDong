package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu_133;
    private String tenNXB_133;
    private int soBanPhatHanh_133;

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu_133, String tenNXB_133, int soBanPhatHanh_133) {
        this.maTaiLieu_133 = maTaiLieu_133;
        this.tenNXB_133 = tenNXB_133;
        this.soBanPhatHanh_133 = soBanPhatHanh_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ma tai lieu: ");
        this.maTaiLieu_133 = sc_133.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        this.tenNXB_133 = sc_133.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        this.soBanPhatHanh_133 = sc_133.nextInt();
        sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMa tai lieu: " + this.maTaiLieu_133);
        System.out.println("\tTen nha xuat ban: " + this.tenNXB_133);
        System.out.println("\tSo ban phat hanh: " + this.soBanPhatHanh_133);
    }

    public String getMaTaiLieu_133() {
        return this.maTaiLieu_133;
    }
}