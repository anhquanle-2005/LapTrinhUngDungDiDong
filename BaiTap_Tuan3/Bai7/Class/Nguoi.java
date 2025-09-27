
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen_133;
    protected Date ngaySinh_133;
    protected String queQuan_133;

    public Nguoi() {

    }

    public Nguoi(String hoTen_133, Date ngaySinh_133, String queQuan_133) {
        this.hoTen_133 = hoTen_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.queQuan_133 = queQuan_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        hoTen_133 = sc_133.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        String strDate_133 = sc_133.nextLine();
        ngaySinh_133 = strToDate(strDate_133);

        System.out.print("\tNhap que quan: ");
        queQuan_133 = sc_133.nextLine();
    }

    private Date strToDate(String strDate_133) {
        Date date_133 = null;

        SimpleDateFormat sdf_133 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_133 = sdf_133.parse(strDate_133);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date_133;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_133);
        System.out.println("\tNgay sinh: " + ngaySinh_133);
        System.out.println("\tQue quan: " + queQuan_133);
    }

    public String getQueQuan() {
        return queQuan_133;
    }

    public Date getNgaySinh() {
        return ngaySinh_133;
    }
}