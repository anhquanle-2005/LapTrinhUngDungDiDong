
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen_133;
    protected Date ngaySinh_133;
    protected int CMND_133;

    public Nguoi() {

    }

    public Nguoi(String hoTen_133, Date ngaySinh_133, int CMND_133) {
        this.hoTen_133 = hoTen_133;
        this.ngaySinh_133 = ngaySinh_133;
        this.CMND_133 = CMND_133;
    }
    
    public Nguoi(String hoTen_133, int CMND_133) {
        this.hoTen_133 = hoTen_133;
        this.CMND_133 = CMND_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen_133 = sc_133.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_133 = sc_133.nextLine();
        this.ngaySinh_133 = strToDate(strDate_133);
        System.out.print("\tNhap CMND: ");
        this.CMND_133 = sc_133.nextInt();
        sc_133.nextLine(); 
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
    
    private String dateToString(Date date_133) {
        if (date_133 == null) {
            return "Khong hop le";
        }
        SimpleDateFormat sdf_133 = new SimpleDateFormat("dd-MM-yyyy");
        return sdf_133.format(date_133);
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + this.hoTen_133);
        System.out.println("\tNgay sinh: " + dateToString(this.ngaySinh_133));
        System.out.println("\tCMND: " + this.CMND_133);
    }

    public int getCMND_133() {
        return this.CMND_133;
    }
}