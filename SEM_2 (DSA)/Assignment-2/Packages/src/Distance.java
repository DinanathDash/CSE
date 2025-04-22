package Packages.src;
public class Distance {
    int meters, centimeters;
    public Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }
    public void display() {
        System.out.println(meters + " meters " + centimeters + " centimeters");
    }
    public static Distance sum(Distance d1, Distance d2) {
        int totalCentimeters = d1.centimeters + d2.centimeters;
        int totalMeters = d1.meters + d2.meters + totalCentimeters / 100;
        totalCentimeters = totalCentimeters % 100;
        return new Distance(totalMeters, totalCentimeters);
    }
}
