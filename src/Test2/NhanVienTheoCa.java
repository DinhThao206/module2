package Test2;

public class NhanVienTheoCa extends NhanVien {
    protected int ca;

    public NhanVienTheoCa(String name, String address, int age) {
        super(name, address, age);
    }

    public NhanVienTheoCa(String name, String address, int age, int ca) {
        super(name, address, age);
        this.ca = ca;
    }

    @Override
    public double tienLuong() {
        return basicSalary * 1.05;
    }
}
