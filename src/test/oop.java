package test;

public class oop {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        SinhVien sv2 = new SinhVien("trung");
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("tèo",9);
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Trường",7 );
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        sv4.setHoTen("Nam");
        sv4.setDiem(8);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        double avgDiem = sv4.avg(9, 6);
        System.out.println(avgDiem);

    }
}
