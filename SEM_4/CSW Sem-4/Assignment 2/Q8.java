interface Vehicle {
    void accelerate();
    void brake();
}

class Car1 implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
    
    public void brake() {
        System.out.println("Car is braking");
    }
    
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }
    
    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}

class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is speeding up");
    }
    
    public void brake() {
        System.out.println("Bicycle is slowing down");
    }
    
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Bicycle bicycle = new Bicycle();
        
        System.out.println("Car:");
        car.accelerate();
        car.brake();
        System.out.println();
        
        System.out.println("Bicycle:");
        bicycle.accelerate();
        bicycle.brake();
        System.out.println();
        
        System.out.println("Car Acceleration:");
        car.accelerate(60);
        car.accelerate(80, 10);
        System.out.println();
        
        System.out.println("Bicycle Acceleration:");
        bicycle.accelerate(20);
    }
}
