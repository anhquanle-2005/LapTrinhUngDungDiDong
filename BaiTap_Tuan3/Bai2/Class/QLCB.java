package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb_133;

    public QLCB() {
        dscb_133 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb_133) {
        dscb_133.add(cb_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        CanBo cb_133;
        System.out.print("Nhap vao so luong can bo: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("Lan nhap thu " + (i_133 + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
            int chon_133 = sc_133.nextInt();
            sc_133.nextLine();

            switch (chon_133) {
                case 1:
                    cb_133 = new KySu();
                    break;
                case 2:
                    cb_133 = new NhanVien();
                    break;
                case 3:
                    cb_133 = new CongNhan();
                    break;
                default:
                    System.out.println("Lua chon khong hop le, mac dinh la Ky Su.");
                    cb_133 = new KySu();
                    break;
            }

            cb_133.nhapThongTin(sc_133);
            themCanBo(cb_133);
        }
    }

    public void timKiemCanBo(String hoTen_133) {
        boolean timThay_133 = false;
        for (CanBo cb_133 : dscb_133) {
            if (hoTen_133.equalsIgnoreCase(cb_133.getHoTen_133())) {
                cb_133.hienThiThongTin();
                timThay_133 = true;
            }
        }
        if (!timThay_133) {
            System.out.println("Khong tim thay can bo co ten: " + hoTen_133);
        }
    }
    
    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SACH CAN BO ---");
        for (CanBo cb_133 : dscb_133) {
            cb_133.hienThiThongTin();
            System.out.println("--------------------");
        }
    }
}