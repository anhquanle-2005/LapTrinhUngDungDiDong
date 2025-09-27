package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia_133;
    private int soTrang_133;

    public Sach() {

    }

    public Sach(String maTaiLieu_133, String tenNXB_133, int soBanPhatHanh_133, String tacGia_133, int soTrang_133) {
        super(maTaiLieu_133, tenNXB_133, soBanPhatHanh_133);
        this.tacGia_133 = tacGia_133;
        this.soTrang_133 = soTrang_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap tac gia: ");
        this.tacGia_133 = sc_133.nextLine();
        System.out.print("\tNhap so trang: ");
        this.soTrang_133 = sc_133.nextInt();
        sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTac gia: " + this.tacGia_133);
        System.out.println("\tSo trang: " + this.soTrang_133);
    }
}