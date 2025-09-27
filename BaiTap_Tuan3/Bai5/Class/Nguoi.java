package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_133;
    private Date ngaySinh_133;
    private String ngheNghiep_133;

    public Nguoi() {

    }

    public Nguoi(String hoTen_133, Date ngaySinh_133, String ngheNghiep_133) {
        this.hoTen_133 = hoTen_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.ngheNghiep_133 = ngheNghiep_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen_133 = sc_133.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_133 = sc_133.nextLine();
        this.ngaySinh_133 = strToDate(strDate_133);
        System.out.print("\tNhap nghe nghiep: ");
        this.ngheNghiep_133 = sc_133.nextLine();
    }

    private Date strToDate(String strDate_133) {
        Date date_133 = null;
        SimpleDateFormat sdf_133 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_133 = sdf_133.parse(strDate_133);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang! Vui long nhap lai.");
        }
        return date_133;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + this.hoTen_133);
        if (this.ngaySinh_133 != null) {
            System.out.println("\tNgay sinh: " + dateToString(this.ngaySinh_133));
        } else {
            System.out.println("\tNgay sinh: Khong hop le");
        }
        System.out.println("\tNghe nghiep: " + this.ngheNghiep_133);
    }

    private String dateToString(Date date_133) {
        SimpleDateFormat sdf_133 = new SimpleDateFormat("dd-MM-yyyy");
        String strDate_133 = sdf_133.format(date_133);
        return strDate_133;
    }

    public Date getNgaySinh_133() {
        return this.ngaySinh_133;
    }
}