package org.example.Bai1;

public class Diem3D extends Diem2d {
    private double z;

    public Diem3D() {
        this(0.0, 0.0, 0.0);
    }
    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    @Override
    public double khoangCach() {
        double d2D = super.khoangCach();
        return Math.sqrt(d2D * d2D + z * z);
    }

    @Override
    public double khoangCach(Diem2d diemKhac) {
        double d2D = super.khoangCach(diemKhac);
        double zKhac = (diemKhac instanceof Diem3D) ? ((Diem3D) diemKhac).z : 0.0;
        double dz = this.z - zKhac;
        return Math.sqrt(d2D * d2D + dz * dz);
    }
    @Override
    public Diem3D doiXung() {
        return new Diem3D(-getX(), -getY(), -z);
    }

    public void tinhTien(double dx, double dy, double dz) {
        super.tinhTien(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Diem3D [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
    }
}