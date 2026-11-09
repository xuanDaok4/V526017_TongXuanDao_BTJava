package org.example.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void hienThi(List<Diem2d> danhSach) {
        for (Diem2d d : danhSach) {
            System.out.println("  " + d);
        }
    }

    public static void main(String[] args) {
        System.out.println("===== DIEM2D =====");
        Diem2d a1 = new Diem2d();
        System.out.println("a1 (ham tao khong doi): " + a1.toString());

        Diem2d a2 = new Diem2d(2.0, 3.0);
        System.out.println("a2 (ham tao co doi)   : " + a2.toString());

        a1.setX(5.0);                           // setter
        a1.setY(-4.0);
        System.out.println("a1 sau khi setX(5), setY(-4): " + a1);

        System.out.println("a2.getX() = " + a2.getX() + ", a2.getY() = " + a2.getY()); // getter

        System.out.println("\n===== DIEM3D =====");
        Diem3D b1 = new Diem3D();
        System.out.println("b1 (ham tao khong doi): " + b1.toString());

        Diem3D b2 = new Diem3D(1.0, 2.0, 3.0);
        System.out.println("b2 (ham tao co doi)   : " + b2.toString());

        b1.setX(4.0);       // kế thừa từ Diem2D
        b1.setY(4.0);       // kế thừa từ Diem2D
        b1.setZ(2.0);       // của riêng Diem3D
        System.out.println("b1 sau khi setX(4), setY(4), setZ(2): " + b1);

        System.out.println("b2.getX() = " + b2.getX()
                + ", b2.getY() = " + b2.getY()
                + ", b2.getZ() = " + b2.getZ());

        Diem2d a3 = new Diem3D(6.0, 8.0, 0.0);
        System.out.println("a3 (Diem2D tro toi Diem3D): " + a3);
        System.out.println();

        List<Diem2d> danhSach = new ArrayList<>();
        danhSach.add(new Diem2d(1.0, 5.0));
        danhSach.add(new Diem2d(3.0, 7.0));
        danhSach.add(new Diem3D(1.0, 5.0, 3.5));
        danhSach.add(new Diem3D(3.0, 7.0, 2.0));

        System.out.println("Danh sach diem ban dau:");
        hienThi(danhSach);

        // 2) Tổng khoảng cách (đến gốc O) của các điểm 2D và các điểm 3D
        double tong2D = 0.0, tong3D = 0.0;
        for (Diem2d d : danhSach) {
            if (d instanceof Diem3D) {
                tong3D += d.khoangCach();
            } else {
                tong2D += d.khoangCach();
            }
        }
        System.out.println("Tong khoang cach cac diem 2D: " + tong2D);
        System.out.println("Tong khoang cach cac diem 3D: " + tong3D);


        int n = danhSach.size();
        for (int i = 0; i < n; i++) {
            danhSach.add(danhSach.get(i).doiXung());
        }
        System.out.println("Danh sach sau khi them cac diem doi xung:");
        hienThi(danhSach);

        Diem2d A = new Diem2d(1, 2), B = new Diem2d(4, 6);
        System.out.println("Khoang cach A(1,2) - B(4,6): " + A.khoangCach(B));

        Diem3D C = new Diem3D(1, 2, 3), D = new Diem3D(4, 6, 15);
        System.out.println("Khoang cach C(1,2,3) - D(4,6,15): " + C.khoangCach(D));

        A.tinhTien(2, -1);
        C.tinhTien(1, 1, 1);
        System.out.println("A sau khi tinh tien (2,-1): " + A);
        System.out.println("C sau khi tinh tien (1,1,1): " + C);
    }
}
