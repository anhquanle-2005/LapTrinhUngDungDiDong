
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds_133;

    public KhachSan() {
        ds_133 = new ArrayList<KhachTro>(10);
    }

    public void themKhachTro(KhachTro kt_133) {
        ds_133.add(kt_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        KhachTro khach_133;

        System.out.print("Nhap vao so luong khach: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.println("Nhap vao thong tin khach tro:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("Khach tro thu " + (i_133 + 1) + " la:");
            khach_133 = new KhachTro();
            khach_133.nhapThongTin(sc_133);
            themKhachTro(khach_133);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SACH KHACH TRO ---");
        for (KhachTro khach_133 : ds_133) {
            khach_133.hienThiThongTin();
            System.out.println("--------------------");
        }
    }

    public double tinhTien(int CMND_133) {
        double tien_133 = 0;
        boolean timThay_133 = false;
        for (KhachTro khach_133 : ds_133) {
            if (khach_133.getCMND_133() == CMND_133) {
                tien_133 = khach_133.getSoNgayTro_133() * khach_133.getGiaPhong_133();
                timThay_133 = true;
                break;
            }
        }
        if (!timThay_133) {
            System.out.println("Khong tim thay khach co CMND: " + CMND_133);
        }
        return tien_133;
    }
}