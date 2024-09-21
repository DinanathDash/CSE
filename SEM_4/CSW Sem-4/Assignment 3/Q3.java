class Car implements Comparable<Car> {
    private String model, color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Blue", 200);
        Car car2 = new Car("Honda", "Red", 180);

        System.out.println("Details of Car 1:\n" + car1);

        System.out.println("\nDetails of Car 2:\n" + car2);

        int comparisonResult = car1.compareTo(car2);
        if (comparisonResult == 0) {
            System.out.println("\nBoth cars have the same speed.");
        } else if (comparisonResult > 0) {
            System.out.println("\nCar 1 has a greater speed.");

        } else {
            System.out.println("\nCar 2 has a greater speed.");
        }
    }
}
