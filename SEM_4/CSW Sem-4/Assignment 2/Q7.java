abstract class Account {
    private int accNum;
    protected double bal;
    
    public Account(int accNum, double bal) {
        this.accNum = accNum;
        this.bal = bal;
    }
    
    public int getAccNum() {
        return accNum;
    }
    
    public double getBal() {
        return bal;
    }
    
    public abstract void deposit(double amt);
    
    public abstract void withdraw(double amt);
}

class SavAcc extends Account {
    private double intRate;
    
    public SavAcc(int accNum, double bal, double intRate) {
        super(accNum, bal);
        this.intRate = intRate;
    }
    
    public double getInterestRate() {
        return intRate;
    }
    
    @Override
    public void deposit(double amt) {
        double interest = amt * intRate / 100;
        double totAmt = amt + interest;
        super.bal += totAmt;
        System.out.println("Deposit of $" + amt + " with interest $" + interest + " successful. New balance: $" + super.bal);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= super.bal) {
            super.bal -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + super.bal);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrAcc extends Account {
    private double overdraftLimit;
    
    public CurrAcc(int accNum, double bal, double overdraftLimit) {
        super(accNum, bal);
        this.overdraftLimit = overdraftLimit;
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    
    @Override
    public void deposit(double amt) {
        super.bal += amt;
        System.out.println("Deposit of $" + amt + " successful. New balance: $" + super.bal);
    }
    
    @Override
    public void withdraw(double amt) {
        if (amt <= super.bal + overdraftLimit) {
            super.bal -= amt;
            System.out.println("Withdrawal of $" + amt + " successful. New balance: $" + super.bal);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        SavAcc savingsAccount = new SavAcc(1001, 5000, 5);
        System.out.println("Savings Account Details:" + "\nAccount Number: " + savingsAccount.getAccNum() + "\nBalance: $" + savingsAccount.getBal());
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);
        
        CurrAcc currAcc = new CurrAcc(2001, 8000, 2000);
        System.out.println("\nCurrent Account Details:" + "\nAccount Number: " + currAcc.getAccNum() + "\nBalance: $" + currAcc.getBal());
        currAcc.deposit(1500);
        currAcc.withdraw(10000);
    }
}
