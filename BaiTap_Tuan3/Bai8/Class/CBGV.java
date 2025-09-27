

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung_133;
    private double thuong_133;
    private double phat_133;
    private double luongThucLinh_133;

    public CBGV() {

    }

    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);

        System.out.print("\tNhap luong cung: ");
        luongCung_133 = sc_133.nextDouble();
        sc_133.nextLine();

        System.out.print("\tNhap thuong: ");
        thuong_133 = sc_133.nextDouble();
        sc_133.nextLine();

        System.out.print("\tNhap phat: ");
        phat_133 = sc_133.nextDouble();
        sc_133.nextLine();

        luongThucLinh_133 = luongCung_133 + thuong_133 - phat_133;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLuong cung: " + luongCung_133);
        System.out.println("\tThuong: " + thuong_133);
        System.out.println("\tPhat: " + phat_133);
        System.out.println("\tLuong thuc linh: " + luongThucLinh_133);
    }

    public double getLuongThucLinh() {
        return luongThucLinh_133;
    }
}