class MobileApp {
    private String simType;

    public MobileApp(String simType) {
        this.simType = simType;
    }

    public void displaySimType() {
        System.out.println("SIM Type: " + simType);
    }
}

public class Q3 {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp("Nano SIM");

        mobileApp.displaySimType();
    }
}
