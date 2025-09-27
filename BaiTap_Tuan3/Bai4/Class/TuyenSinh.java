package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> dsts_133;

    public TuyenSinh() {
        dsts_133 = new ArrayList<ThiSinh>(10);
    }

    public void themThiSinh(ThiSinh ts_133) {
        dsts_133.add(ts_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        ThiSinh ts_133;
        int chon_133;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n_133 = sc_133.nextInt();
        sc_133.nextLine(); 

        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("Thi sinh thu " + (i_133 + 1) + ":");
            System.out.print("Chon khoi thi (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon_133 = sc_133.nextInt();
            sc_133.nextLine(); 

            switch (chon_133) {
                case 1:
                    ts_133 = new KhoiA();
                    break;
                case 2:
                    ts_133 = new KhoiB();
                    break;
                case 3:
                    ts_133 = new KhoiC();
                    break;
                default:
                    System.out.println("Lua chon khong hop le, mac dinh la Khoi A.");
                    ts_133 = new KhoiA();
                    break;
            }

            ts_133.nhapThongTin(sc_133);
            themThiSinh(ts_133);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SACH THI SINH ---");
        for (int i_133 = 0; i_133 < dsts_133.size(); i_133++) {
            System.out.println("Thong tin thi sinh thu " + (i_133 + 1) + ":");
            dsts_133.get(i_133).hienThiThongTin();
            System.out.println("--------------------");
        }
    }

    public void timKiemThiSinh(int soBaoDanh_133) {
        boolean timThay_133 = false;
        for (ThiSinh ts_133 : dsts_133) {
            if (ts_133.getSoBD_133() == soBaoDanh_133) {
                System.out.println("\n--- KET QUA TIM KIEM ---");
                ts_133.hienThiThongTin();
                timThay_133 = true;
                break; 
            }
        }
        if (!timThay_133) {
            System.out.println("Khong tim thay thi sinh co so bao danh: " + soBaoDanh_133);
        }
    }
}