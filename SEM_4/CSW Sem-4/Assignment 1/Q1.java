import java.util.*;

class BankAcc {
    private double bal;

    public BankAcc(double initialBal) {
        bal = initialBal;
    }

    public void deposit(double amt) {
        bal += amt;
        System.out.println(amt + " deposited successfully.");
    }

    public void withdraw(double amt) {
        if (bal >= amt) {
            bal -= amt;
            System.out.println(amt + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBal() {
        return bal;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBal = sc.nextDouble();

        BankAcc acc = new BankAcc(initialBal);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    acc.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    acc.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.println("Current balance: " + acc.getBal());
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
