package Test2;

public class NhanVienHanhChinh extends  NhanVien{
    public NhanVienHanhChinh(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public double tienLuong() {
        return basicSalary;
    }

}
