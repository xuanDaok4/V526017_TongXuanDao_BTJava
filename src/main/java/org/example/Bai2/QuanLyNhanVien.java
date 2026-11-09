package org.example.Bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien {
    static void inDanhSach(List<NhanVien> ds) {
        for (int i = 0; i < ds.size(); i++) {
            System.out.print((i + 1) + ". ");
            ds.get(i).xuat();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = Nguoi.nhapSoNguyen(sc, "Nhap so luong nhan vien n: ");
            if (n == 0) System.out.println("  -> n phai > 0!");
        } while (n == 0);

        List<NhanVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu " + (i + 1) + ":");
            NhanVien nv = new NhanVien();
            nv.nhap(sc);
            ds.add(nv);
        }

        System.out.println("\n===== DANH SACH NHAN VIEN DA NHAP =====");
        inDanhSach(ds);
        int maxSnct = ds.get(0).getSnct();
        for (NhanVien nv : ds) {
            if (nv.getSnct() > maxSnct) {
                maxSnct = nv.getSnct();
            }
        }
        System.out.println("\n===== NHAN VIEN CO SO NAM CONG TAC NHIEU NHAT (" + maxSnct + " nam) =====");
        for (NhanVien nv : ds) {
            if (nv.getSnct() == maxSnct) {   // in tất cả nếu có nhiều người bằng nhau
                nv.xuat();
            }
        }

        ds.sort(Comparator.comparingDouble(NhanVien::tinhLuong).reversed());
        System.out.println("\n===== DANH SACH THEO LUONG GIAM DAN =====");
        inDanhSach(ds);

        sc.close();
    }
}
