

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro_133;
    private String loaiPhong_133;
    private double giaPhong_133;

    public KhachTro() {

    }

    public KhachTro(String hoTen_133, int CMND_133, int soNgayTro_133, String loaiPhong_133, double giaPhong_133) {
        super(hoTen_133, CMND_133); 
        this.soNgayTro_133 = soNgayTro_133;
        this.loaiPhong_133 = loaiPhong_133;
        this.giaPhong_133 = giaPhong_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap so ngay tro: ");
        this.soNgayTro_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.print("\tNhap loai phong: ");
        this.loaiPhong_133 = sc_133.nextLine();
        System.out.print("\tNhap gia phong: ");
        this.giaPhong_133 = sc_133.nextDouble();
        sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + this.soNgayTro_133);
        System.out.println("\tLoai phong: " + this.loaiPhong_133);
        System.out.println("\tGia phong: " + this.giaPhong_133);
    }

    public int getSoNgayTro_133() {
        return this.soNgayTro_133;
    }

    public double getGiaPhong_133() {
        return this.giaPhong_133;
    }
}