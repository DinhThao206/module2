package test;

public class SinhVien {
    private String hoTen;
    private double diem;

    //    Constructor mặc định
    public SinhVien() {
        hoTen = "No Name";
        diem = 0.0;
    }

    //    Constructor có đối số


    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void hienThiThongTin() {
        System.out.println(hoTen + ": " + diem);
    }

    public double avg(double toan, double van) {
        return (toan + van) / 2;
    }

    //getter and setter
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
