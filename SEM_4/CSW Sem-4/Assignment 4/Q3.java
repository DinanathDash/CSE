import java.util.*;

class Car implements Comparable<Car> {
    private int modelNo, stock;
    private String name;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        if (this.stock < car.stock) {
            return -1;
        } else if (this.stock > car.stock) {
            return 1;
        }
        return 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmodelNo() {
        return modelNo;
    }

    public void setmodelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(2013, "Creta", 10));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "Audi", 45));
        carList.add(new Car(2015, "BMW", 55));

        Collections.sort(carList);

        System.out.println("Sorted Cars by Stock:");
        for (Car car : carList) {
            System.out.println("ModelNo: " + car.getmodelNo() + ", Name: " + car.getName() + ", Stock: " + car.getStock());
        }
    }
}
