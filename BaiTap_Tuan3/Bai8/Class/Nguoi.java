

import java.util.Scanner;

public class Nguoi {
    protected String hoTen_133;
    protected String ngaySinh_133;
    protected String queQuan_133;

    public Nguoi() {

    }

    public Nguoi(String hoTen_133, String ngaySinh_133, String queQuan_133) {
        this.hoTen_133 = hoTen_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.queQuan_133 = queQuan_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        hoTen_133 = sc_133.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh_133 = sc_133.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan_133 = sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_133);
        System.out.println("\tNgay sinh: " + ngaySinh_133);
        System.out.println("\tQue quan: " + queQuan_133);
    }
}