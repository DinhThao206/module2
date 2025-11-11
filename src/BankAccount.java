public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp " + amount + " thành công");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư của tài khản không đủ");

        } else {
            amount -= balance;
            System.out.println("Rút " + amount + " thành công");
        }
    }

    public void display() {
        System.out.println("Tài khoản: " + accountNumber + ", Chủ sở hữu: " + owner + ", Số dư hiện tại là: " + balance);
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        // Cách 1
        BankAccount a1 = new BankAccount();
        a1.setAccountNumber("001");
        a1.setOwner("An");
        a1.setBalance(1000);
        a1.deposit(500);
        a1.withdraw(300);
        a1.display();

        BankAccount a4 = new BankAccount("004", "Dũng", 1500);
        a4.withdraw(700);
        a4.display();

        BankAccount a5 = new BankAccount("005", "Hà", 3000);
        a5.deposit(1000);
        a5.withdraw(3500);
        a5.display();
    }
}
