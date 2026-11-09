package org.example.Bai1;

public class Diem2d {
    private double x;
    private double y;

    public Diem2d() {
        this(0.0, 0.0);
    }

    public Diem2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double khoangCach() {
        return Math.sqrt(x * x + y * y);
    }

    public double khoangCach(Diem2d diemKhac) {
        double dx = this.x - diemKhac.x;
        double dy = this.y - diemKhac.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Diem2d doiXung() {
        return new Diem2d(-x, -y);
    }

    public void tinhTien(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Diem2D [x=" + x + ", y=" + y + "]";
    }
}
