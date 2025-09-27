package Class;

import java.util.Scanner;

public class ThiSinh {
    private int soBD_133;
    private String hoTen_133;
    private String diaChi_133;
    private String dienUuTien_133;

    public ThiSinh() {

    }

    public ThiSinh(int soBD_133, String hoTen_133, String diaChi_133, String dienUuTien_133) {
        this.soBD_133 = soBD_133;
        this.hoTen_133 = hoTen_133;
        this.diaChi_133 = diaChi_133;
        this.dienUuTien_133 = dienUuTien_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap so bao danh: ");
        this.soBD_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.print("\tNhap ho ten: ");
        this.hoTen_133 = sc_133.nextLine();
        System.out.print("\tNhap dia chi: ");
        this.diaChi_133 = sc_133.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        this.dienUuTien_133 = sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + this.soBD_133);
        System.out.println("\tHo ten: " + this.hoTen_133);
        System.out.println("\tDia chi: " + this.diaChi_133);
        System.out.println("\tDien uu tien: " + this.dienUuTien_133);
    }

    public int getSoBD_133() {
        return this.soBD_133;
    }
}