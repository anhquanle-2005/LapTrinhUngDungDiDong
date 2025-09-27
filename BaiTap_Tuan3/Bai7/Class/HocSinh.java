import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop_133;
    private String khoHoc_133;
    private String kyHoc_133;

    public HocSinh() {

    }

    public HocSinh(String hoTen, String lop_133, String khoaHoc_133, String kyHoc_133) {
        this.hoTen_133 = hoTen;
        this.lop_133 = lop_133;
        this.khoHoc_133 = khoaHoc_133;
        this.kyHoc_133 = kyHoc_133;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap lop: ");
        lop_133 = sc.nextLine();

        System.out.print("\tNhap khoa hoc: ");
        khoHoc_133 = sc.nextLine();

        System.out.print("\tNhap ky hoc: ");
        kyHoc_133 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLop: " + lop_133);
        System.out.println("\tKhoa hoc: " + khoHoc_133);
        System.out.println("\tKy hoc: " + kyHoc_133);
    }

    public String getLop() {
        return lop_133;
    }
}