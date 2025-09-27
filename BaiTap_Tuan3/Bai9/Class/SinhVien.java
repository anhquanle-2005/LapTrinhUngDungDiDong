

import java.util.Scanner;

public class SinhVien {
    protected String hoTen_133;
    protected String maSV_133;
    protected String ngaySinh_133;
    protected String lop_133;

    public SinhVien() {

    }

    public SinhVien(String hoTen_133, String maSV_133, String ngaySinh_133, String lop_133) {
        this.hoTen_133 = hoTen_133;
        this.maSV_133 = maSV_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.lop_133 = lop_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        hoTen_133 = sc_133.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV_133 = sc_133.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh_133 = sc_133.nextLine();

        System.out.print("\tNhap lop: ");
        lop_133 = sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_133);
        System.out.println("\tNgay sinh: " + ngaySinh_133);
        System.out.println("\tMa sinh vien: " + maSV_133);
        System.out.println("\tLop: " + lop_133);
    }
}