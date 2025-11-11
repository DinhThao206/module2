package Test2;

public abstract class NhanVien {
    protected String name;
    protected String address;
    protected int age ;
    protected double basicSalary = 1000;
    public NhanVien(String name , String address, int age){
        this.name = name;
        this.age = age ;
        this.address = address;
    }
public abstract double tienLuong();

}
