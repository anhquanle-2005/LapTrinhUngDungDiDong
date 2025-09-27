package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac_133;

    public CongNhan() {

    }

    public CongNhan(String hoTen_133, String ngaySinh_133, String gioiTinh_133, String diaChi_133, String bac_133) {
        super(hoTen_133, ngaySinh_133, gioiTinh_133, diaChi_133);
        this.bac_133 = bac_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap bac: ");
        this.bac_133 = sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + this.bac_133);
    }
}