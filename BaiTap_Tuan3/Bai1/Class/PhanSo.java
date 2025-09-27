package Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo_133;
    private int mauSo_133;

    public PhanSo() {
        this.tuSo_133 = 0;
        this.mauSo_133 = 1;
    }

    public PhanSo(int tuSo_133, int mauSo_133) {
        this.tuSo_133 = tuSo_133;
        this.mauSo_133 = mauSo_133;
        toiGianPS(); 
    }

    public void nhapPS(Scanner sc_133) {
        int a_133;
        int b_133;

        do {
            System.out.print("\tNhap vao tu so: ");
            a_133 = sc_133.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b_133 = sc_133.nextInt();

            if (b_133 == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                this.tuSo_133 = a_133;
                this.mauSo_133 = b_133;
            }
        } while (b_133 == 0);

        toiGianPS(); 
    }

    public void hienThiPS() {
        if (this.tuSo_133 * this.mauSo_133 < 0) {
            System.out.println("\t-" + Math.abs(this.tuSo_133) + "/" + Math.abs(this.mauSo_133));
        } else {
            System.out.println("\t" + Math.abs(this.tuSo_133) + "/" + Math.abs(this.mauSo_133));
        }
    }

    public PhanSo congPS(PhanSo ps2_133) {
        int a_133 = this.tuSo_133 * ps2_133.mauSo_133 + ps2_133.tuSo_133 * this.mauSo_133;
        int b_133 = this.mauSo_133 * ps2_133.mauSo_133;
        PhanSo ps_133 = new PhanSo(a_133, b_133);
        ps_133.toiGianPS();
        return ps_133;
    }

    public PhanSo truPS(PhanSo ps2_133) {
        int a_133 = this.tuSo_133 * ps2_133.mauSo_133 - ps2_133.tuSo_133 * this.mauSo_133;
        int b_133 = this.mauSo_133 * ps2_133.mauSo_133;
        PhanSo ps_133 = new PhanSo(a_133, b_133);
        ps_133.toiGianPS();
        return ps_133;
    }

    public PhanSo nhanPS(PhanSo ps2_133) {
        int a_133 = this.tuSo_133 * ps2_133.tuSo_133;
        int b_133 = this.mauSo_133 * ps2_133.mauSo_133;
        PhanSo ps_133 = new PhanSo(a_133, b_133);
        ps_133.toiGianPS();
        return ps_133;
    }

    public PhanSo chiaPS(PhanSo ps2_133) {
        int a_133 = this.tuSo_133 * ps2_133.mauSo_133;
        int b_133 = this.mauSo_133 * ps2_133.tuSo_133;
        PhanSo ps_133 = new PhanSo(a_133, b_133);
        ps_133.toiGianPS();
        return ps_133;
    }

    private int timUSCLN(int a_133, int b_133) {
        a_133 = Math.abs(a_133);
        b_133 = Math.abs(b_133);

        if (b_133 == 0) {
            return a_133;
        }

        int r_133 = a_133 % b_133;
        while (r_133 != 0) {
            a_133 = b_133;
            b_133 = r_133;
            r_133 = a_133 % b_133;
        }
        return b_133;
    }

    public boolean kiemTraToiGian() {
        return timUSCLN(this.tuSo_133, this.mauSo_133) == 1;
    }

    public void toiGianPS() {
        int x_133 = timUSCLN(this.tuSo_133, this.mauSo_133);
        this.tuSo_133 /= x_133;
        this.mauSo_133 /= x_133;
    }
}
