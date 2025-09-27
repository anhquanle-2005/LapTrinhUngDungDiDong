

import java.util.Scanner;



public class Test {

    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);

        QLHS list_133 = new QLHS();

        list_133.nhapDanhSachHS(sc_133);

        System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
        list_133.timKiemThongTin(1985, "Thai Nguyen");

        System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
        list_133.timKiemThongTin("10A1");

        sc_133.close();
    }

}