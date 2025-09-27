
import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs_133;

    public QLHS() {
        dshs_133 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs_133) {
        dshs_133.add(hs_133);
    }

    public void nhapDanhSachHS(Scanner sc_133) {
        HocSinh hs_133;

        System.out.print("Nhap vao so luong hoc sinh: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine(); // Consume newline left-over

        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("\tHoc sinh thu " + (i_133 + 1) + " la:");

            hs_133 = new HocSinh();
            hs_133.nhapThongTin(sc_133);

            themHS(hs_133);
        }
    }

    public void hienThiDanhSach() {
        int n_133 = dshs_133.size();
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("\tHoc sinh thu " + (i_133 + 1) + " la:");
            dshs_133.get(i_133).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam_133, String que_133) {
        for (HocSinh hs_133 : dshs_133) {
            if ((hs_133.getNgaySinh().getYear() + 1900 == nam_133) && (que_133.equals(hs_133.getQueQuan()))) {
                hs_133.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop_133) {
        for (HocSinh hs_133 : dshs_133) {
            if (lop_133.equals(hs_133.getLop())) {
                hs_133.hienThiThongTin();
            }
        }
    }
}