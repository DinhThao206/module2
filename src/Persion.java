public class Persion {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String gender;

    // Constructor
    public Persion() {

    }

    public Persion(String name, int age, String address, String phone, String email, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Hành động
    public void run() {
        System.out.println(name + " is running");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Class Test
class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Persion
        Persion giang = new Persion("Giang", 20, "Hà Nội", "0123456789", "giang@gmail.com", "Male");
        System.out.println(giang.getName());
        System.out.println(giang.getAge());
        System.out.println(giang.getAddress());
        System.out.println(giang.getPhone());
        System.out.println(giang.getEmail());
        System.out.println(giang.getGender());

        System.out.println("-------------------");

        Persion toan = new Persion();
        toan.setName("Toan");

        toan.setAge(19);
        toan.setAddress("Đà Nẵng");

        System.out.println(giang.getName());
        System.out.println(giang.getAge());
        System.out.println(giang.getAddress());
    }
}

