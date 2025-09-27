package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd_133;

    public KhuPho() {
        dshd_133 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan_133) {
        dshd_133.add(hoDan_133);
    }

    public void nhapDanhSach(Scanner sc_133) {
        HoDan hoDan_133;

        System.out.print("Nhap vao so ho dan: ");
        int soHoDan_133 = sc_133.nextInt();
        sc_133.nextLine();

        System.out.println("Nhap vao thong tin cho tung ho dan:");
        for (int i_133 = 0; i_133 < soHoDan_133; i_133++) {
            System.out.println("Ho dan thu " + (i_133 + 1) + " la:");
            hoDan_133 = new HoDan();
            hoDan_133.nhapThongTin(sc_133);
            themHoDan(hoDan_133);
        }
    }

    public void hienThiDanhSach() {
        int n_133 = dshd_133.size();

        for (int i_133 = 0; i_133 < n_133; i_133++) {
            System.out.println("\nThong tin ho dan thu " + (i_133 + 1) + ":");
            dshd_133.get(i_133).hienThiThongTin();
        }
    }

    public void timNguoiMungTho80() {
        Date now_133 = new Date();
        int namHienTai_133 = now_133.getYear() + 1900;
        boolean timThay_133 = false;

        System.out.println("\n--- DANH SACH CAC HO CO NGUOI MUNG THO 80 TUOI ---");
        
        for (HoDan hoDan_133 : dshd_133) {
            Nguoi[] dstv_133 = hoDan_133.getList_133();
            if (dstv_133 == null) continue; 

            for (int i_133 = 0; i_133 < hoDan_133.getSoNguoi_133(); i_133++) {
                if (dstv_133[i_133] != null && dstv_133[i_133].getNgaySinh_133() != null) {
                    int namSinh_133 = dstv_133[i_133].getNgaySinh_133().getYear() + 1900;
                    if (namHienTai_133 - namSinh_133 == 80) {
                        hoDan_133.hienThiThongTin();
                        timThay_133 = true;
                        break; 
                    }
                }
            }
        }

        if (!timThay_133) {
            System.out.println("Khong tim thay ho dan nao co nguoi 80 tuoi.");
        }
    }
}