package Packages.src;
public class RoomServiceMeal extends RestaurantMeal {
    HotelService hotelService;
    public RoomServiceMeal(String name, double price, int roomNumber) {
        super(name, price);
        hotelService = new HotelService("room service", 24.00, roomNumber);
    }
    public void display() {
        super.display();
        hotelService.display();
        System.out.println("Total: " + (price + hotelService.serviceFee));
    }
}
