package Packages.src;
public class HotelService {
    String serviceName;
    double serviceFee;
    int roomNumber;
    public HotelService(String serviceName, double serviceFee, int roomNumber) {
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
        this.roomNumber = roomNumber;
    }
    public void display() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Service Fee: " + serviceFee);
        System.out.println("Room Number: " + roomNumber);
    }
}
