import java.util.Scanner;
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}
class Bank {
    int account_no;
    String name;
    double balance;
    public Bank(int account_no, String name, double balance) {
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }
    public void withdraw(double amount) throws InvalidBalanceException {
        if (balance - amount < 0) {
            throw new InvalidBalanceException("Balance cannot be less than 0");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
} 
public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int account_no = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        Bank bank = new Bank(account_no, name, balance);
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        try {
            bank.withdraw(amount);
            System.out.println("After Withdraw, Balance: " + bank.getBalance());
        } catch (InvalidBalanceException e) {
            System.out.println(e);
        }
        sc.close();
    }        
}
