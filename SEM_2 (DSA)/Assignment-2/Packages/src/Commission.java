package Packages.src;
public class Commission {
    double sales;
    public Commission(double sales) {
        this.sales = sales;
    }
    public double getCommission() {
        double commission;
        if (sales < 100) {
            commission = sales * 0.02;
        } else if (sales >= 100 && sales <= 5000) {
            commission = sales * 0.05;
        } else {
            commission = sales * 0.08;
        }
        return commission;
    }
}
