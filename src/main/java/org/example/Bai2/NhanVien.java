package org.example.Bai2;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    public static final double LUONG_CO_BAN = 1_500_000;
    public static final double PHU_CAP_MOI_NAM = 200_000;

    private int snct;
    private double hsl;
    public NhanVien() {
        super();
        this.snct = 0;
        this.hsl = 0;
    }

    public NhanVien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }
    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double tinhPhuCap() {
        return PHU_CAP_MOI_NAM * snct;
    }
    public double tinhLuong() {
        return LUONG_CO_BAN * hsl + tinhPhuCap();
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);   // nhập họ tên, tuổi
        snct = nhapSoNguyen(sc, "  So nam cong tac: ");
        hsl = nhapSoThuc(sc, "  He so luong: ");
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" | SNCT: %2d | HSL: %5.2f | Luong: %,12.0f VND",
                snct, hsl, tinhLuong());
    }

}
