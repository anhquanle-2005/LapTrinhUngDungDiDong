package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi_133;
    private int soNha_133;
    private Nguoi[] list_133;

    public HoDan() {
        list_133 = new Nguoi[10];
    }

    public HoDan(String hoTen_133, Date ngaySinh_133, String ngheNghiep_133, int soNguoi_133, int soNha_133) {
        super(hoTen_133, ngaySinh_133, ngheNghiep_133);
        this.soNguoi_133 = soNguoi_133;
        this.soNha_133 = soNha_133;
    }

    @Override
    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap so nguoi: ");
        this.soNguoi_133 = sc_133.nextInt();
        sc_133.nextLine();
        System.out.print("\tNhap so nha: ");
        this.soNha_133 = sc_133.nextInt();
        sc_133.nextLine();
        
        // Khởi tạo mảng với kích thước thực tế
        this.list_133 = new Nguoi[this.soNguoi_133];

        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i_133 = 0; i_133 < this.soNguoi_133; i_133++) {
            System.out.println("Nguoi thu " + (i_133 + 1) + " la:");
            list_133[i_133] = new Nguoi();
            list_133[i_133].nhapThongTin(sc_133);
        }
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + this.soNguoi_133);
        System.out.println("\tSo nha: " + this.soNha_133);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i_133 = 0; i_133 < this.soNguoi_133; i_133++) {
            System.out.println("Nguoi thu " + (i_133 + 1) + " la:");
            list_133[i_133].hienThiThongTin();
        }
    }

    public Nguoi[] getList_133() {
        return this.list_133;
    }

    public int getSoNguoi_133() {
        return this.soNguoi_133;
    }
}