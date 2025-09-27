package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl_133;

    public QuanLySach() {
        dstl_133 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl_133) {
        dstl_133.add(tl_133);
    }

    public void nhapDanhSachTL(Scanner sc_133) {
        int chon_133;
        String stop_133;
        TaiLieu tl_133;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon_133 = sc_133.nextInt();
            sc_133.nextLine();

            switch (chon_133) {
                case 1:
                    tl_133 = new Sach();
                    break;
                case 2:
                    tl_133 = new TapChi();
                    break;
                case 3:
                    tl_133 = new Bao();
                    break;
                default:
                    tl_133 = new Sach();
                    break;
            }

            tl_133.nhapThongTin(sc_133);
            themTaiLieu(tl_133);

            System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
            stop_133 = sc_133.nextLine();
        } while (stop_133.equalsIgnoreCase("c"));
    }

    public void timMaTL(String maTL_133) {
        boolean timThay_133 = false;
        for (TaiLieu tl_133 : dstl_133) {
            if (maTL_133.equalsIgnoreCase(tl_133.getMaTaiLieu_133())) {
                tl_133.hienThiThongTin();
                timThay_133 = true;
            }
        }
        if (!timThay_133) {
            System.out.println("Khong tim thay tai lieu co ma: " + maTL_133);
        }
    }

    public void timLoaiTL(String loai_133) {
        boolean timThay_133 = false;
        System.out.println("\n--- KET QUA TIM KIEM THEO LOAI: " + loai_133 + " ---");
        for (TaiLieu tl_133 : dstl_133) {
            if (loai_133.equalsIgnoreCase("Sach") && (tl_133 instanceof Sach)) {
                tl_133.hienThiThongTin();
                timThay_133 = true;
            } else if (loai_133.equalsIgnoreCase("TapChi") && (tl_133 instanceof TapChi)) {
                tl_133.hienThiThongTin();
                timThay_133 = true;
            } else if (loai_133.equalsIgnoreCase("Bao") && (tl_133 instanceof Bao)) {
                tl_133.hienThiThongTin();
                timThay_133 = true;
            }
        }
        if (!timThay_133) {
            System.out.println("Khong co tai lieu nao thuoc loai: " + loai_133);
        }
    }
}