package Class;

import java.util.Scanner;

public class CanBo {
    private String hoTen_133;
    private String ngaySinh_133;
    private String gioiTinh_133;
    private String diaChi_133;

    public CanBo() {

    }

    public CanBo(String hoTen_133, String ngaySinh_133, String gioiTinh_133, String diaChi_133) {
        this.hoTen_133 = hoTen_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.gioiTinh_133 = gioiTinh_133;
        this.diaChi_133 = diaChi_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen_133 = sc_133.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        this.ngaySinh_133 = sc_133.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        this.gioiTinh_133 = sc_133.nextLine();
        System.out.print("\tNhap dia chi: ");
        this.diaChi_133 = sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + this.hoTen_133);
        System.out.println("\tNgay sinh: " + this.ngaySinh_133);
        System.out.println("\tGioi tinh: " + this.gioiTinh_133);
        System.out.println("\tDia chi: " + this.diaChi_133);
    }

    public String getHoTen_133() {
        return this.hoTen_133;
    }
}