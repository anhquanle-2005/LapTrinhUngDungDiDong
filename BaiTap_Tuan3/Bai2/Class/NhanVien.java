package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec_133;

    public NhanVien() {

    }

    public NhanVien(String hoTen_133, String ngaySinh_133, String gioiTinh_133, String diaChi_133, String congViec_133) {
        super(hoTen_133, ngaySinh_133, gioiTinh_133, diaChi_133);
        this.congViec_133 = congViec_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap cong viec: ");
        this.congViec_133 = sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + this.congViec_133);
    }
}