

import java.util.Scanner;



public class Test {

    public static void main(String[] args) {
        Scanner sc_133 = new Scanner(System.in);

        QuanLy ql_133 = new QuanLy();

        ql_133.nhapDanhSach(sc_133);

        System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
        ql_133.timKiem(8000000);

        sc_133.close();
    }

}