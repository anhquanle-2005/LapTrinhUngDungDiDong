package Class;
import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1_133;
    private String mon2_133;
    private String mon3_133;

    public KhoiA() {

    }

    public KhoiA(String mon1_133, String mon2_133, String mon3_133) {
        this.mon1_133 = mon1_133;
        this.mon2_133 = mon2_133;
        this.mon3_133 = mon3_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);
        System.out.print("\tNhap mon 1: ");
        this.mon1_133 = sc_133.nextLine();
        System.out.print("\tNhap mon 2: ");
        this.mon2_133 = sc_133.nextLine();
        System.out.print("\tNhap mon 3: ");
        this.mon3_133 = sc_133.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + this.mon1_133 + " - " + this.mon2_133 + " - " + this.mon3_133);
    }
}