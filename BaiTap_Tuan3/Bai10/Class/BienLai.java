

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi_133;
    private int chiSoCu_133;
    private double tien_133;

    public BienLai() {

    }

    public BienLai(int chiSoMoi_133, int chiSoCu_133, double tien_133) {
        this.chiSoMoi_133 = chiSoMoi_133;
        this.chiSoCu_133 = chiSoCu_133;
        this.tien_133 = tien_133;
    }

    public BienLai(String tenChuHo, int chiSoMoi_133, int chiSoCu_133, double tien_133) {
        this.tenChuHo_133 = tenChuHo;
        this.chiSoMoi_133 = chiSoMoi_133;
        this.chiSoCu_133 = chiSoCu_133;
        this.tien_133 = tien_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu_133 = sc_133.nextInt();
        sc_133.nextLine();
        tien_133 = (chiSoMoi_133 - chiSoCu_133) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi_133);
        System.out.println("\tChi so cu: " + chiSoCu_133);
        System.out.println("\tTien: " + tien_133);
    }
}