class Deposit {
    long Principal;
    int Time;
    double rate;
    double Total_amt;
    Deposit() {
        Principal = 0;
        Time = 0;
        rate = 0;
        Total_amt = 0;
    }
    Deposit(long p, int t, double r) {
        Principal = p;
        Time = t;
        rate = r;
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
    Deposit(long p, int t) {
        Principal = p;
        Time = t;
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
    Deposit(long p, double r) {
        Principal = p;
        rate = r;
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
    void display() {
        System.out.println("Principal : " + Principal);
        System.out.println("Time : " + Time);
        System.out.println("Rate : " + rate);
        System.out.println("Total Amount : " + Total_amt);
    }
    void calc_amt() {
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
}
public class Q5{
    public static void main(String[] args) {
        Deposit d1=new Deposit(1000, 2, 1.2);
        d1.display();
        d1.calc_amt();
    }
}