
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon_133;
    private Date ngayMuon_133;
    private Date hanTra_133;
    private String soHieu_133;

    public TheMuon() {

    }

    public TheMuon(int soMuon_133, Date ngayMuon_133, String soHieu_133) {
        this.soMuon_133 = soMuon_133;
        this.ngayMuon_133 = ngayMuon_133;
        this.soHieu_133 = soHieu_133;
    }

    public void nhapThongTin(Scanner sc_133) {
        super.nhapThongTin(sc_133);

        System.out.print("\tNhap so muon: ");
        soMuon_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.print("\tNhap ngay muon: ");
        String strNgayMuon_133 = sc_133.nextLine();
        ngayMuon_133 = strToDate(strNgayMuon_133);

        System.out.print("\tNhap ngay tra: ");
        String strNgayTra_133 = sc_133.nextLine();
        hanTra_133 = strToDate(strNgayTra_133);

        System.out.print("\tNhap so hieu: ");
        soHieu_133 = sc_133.nextLine();
    }

    private Date strToDate(String strDate_133) {
        Date date_133 = null;

        SimpleDateFormat sdf_133 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_133 = sdf_133.parse(strDate_133);
        } catch (ParseException e_133) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date_133;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo phieu muon: " + soMuon_133);
        System.out.println("\tNgay muon: " + ngayMuon_133);
        System.out.println("\tHan tra: " + hanTra_133);
        System.out.println("\tSo hieu: " + soHieu_133);
    }

    public Date getHanTra() {
        return hanTra_133;
    }
}