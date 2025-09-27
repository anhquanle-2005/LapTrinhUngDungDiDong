
import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo_133;
    protected int soNha_133;
    protected String maCongTo_133;

    public KhachHang() {

    }

    public KhachHang(String tenChuHo_133, int soNha_133, String maCongTo_133) {
        this.tenChuHo_133 = tenChuHo_133;
        this.soNha_133 = soNha_133;
        this.maCongTo_133 = maCongTo_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo_133 = sc_133.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo_133 = sc_133.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo_133);
        System.out.println("\tSo nha: " + soNha_133);
        System.out.println("\tMa cong to: " + maCongTo_133);
    }
}