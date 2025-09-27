package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh_133;

    public Bao() {

    }

    public Bao(String maTaiLieu_133, String tenNXB_133, int soBanPhatHanh_133, String ngayPhatHanh_133) {
        super(maTaiLieu_133, tenNXB_133, soBanPhatHanh_133);
        this.ngayPhatHanh_133 = ngayPhatHanh_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap ngay phat hanh: ");
        this.ngayPhatHanh_133 = sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + this.ngayPhatHanh_133);
    }
}