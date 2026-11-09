package org.example.Bai2;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    public Nguoi() {
        this("", 0);
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap(Scanner sc) {
        System.out.print("  Ho ten: ");
        hoTen = sc.nextLine().trim();
        tuoi = nhapSoNguyen(sc, "  Tuoi: ");
    }

    public void xuat() {
        System.out.println(this);   // gọi toString()
    }

    @Override
    public String toString() {
        return String.format("%-20s | Tuoi: %3d", hoTen, tuoi);
    }

    protected static int nhapSoNguyen(Scanner sc, String loiNhac) {
        while (true) {
            System.out.print(loiNhac);
            try {
                int so = Integer.parseInt(sc.nextLine().trim());
                if (so >= 0) return so;
            } catch (NumberFormatException e) {
            }
            System.out.println("  -> Vui long nhap so nguyen >= 0!");
        }
    }

    protected static double nhapSoThuc(Scanner sc, String loiNhac) {
        while (true) {
            System.out.print(loiNhac);
            try {
                double so = Double.parseDouble(sc.nextLine().trim());
                if (so >= 0) return so;
            } catch (NumberFormatException e) {
            }
            System.out.println("  -> Vui long nhap so >= 0!");
        }
    }
}
