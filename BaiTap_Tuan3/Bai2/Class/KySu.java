package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao_133;

    public KySu() {

    }

    public KySu(String hoTen_133, String ngaySinh_133, String gioiTinh_133, String diaChi_133, String nganhDaoTao_133) {
        super(hoTen_133, ngaySinh_133, gioiTinh_133, diaChi_133);
        this.nganhDaoTao_133 = nganhDaoTao_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap nganh dao tao: ");
        this.nganhDaoTao_133 = sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + this.nganhDaoTao_133);
    }
}