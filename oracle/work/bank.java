import java.lang.Math;
public class bank {
    private int bank_num;
    private String usr_name;
    private double balance;
    private String usr_address;

    public int getNum() {
        return bank_num;
    }
    public String getName() {
        return usr_name;
    }
    public String getAddr() {
        return usr_address;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double x) {
        balance -= x;
    }
    public void deposit(double x) {
        balance += x;
    }
    bank(String name, double balance_init, String addr) {
        usr_name = name;
        balance = balance_init;
        usr_address = addr;
        bank_num = (int) (Math.random() * 10000);
    }
    public static void main(String[] args) {
        bank Bank = new bank("Alex", 1072.23, "some_address_lmao");
        System.out.println(Bank.getNum());
        System.out.println(Bank.getName());
        System.out.println(Bank.getAddr());
        System.out.println(Bank.getBalance());
        Bank.withdraw(100.0);
        System.out.println(Bank.getBalance());
        Bank.deposit(101);
        System.out.println(Bank.getBalance());

    }
}
