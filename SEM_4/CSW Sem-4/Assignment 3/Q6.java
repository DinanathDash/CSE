class Animal {
    String name, color, type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        String uniqueId = name + color + type;
        return uniqueId.hashCode();
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal tiger = new Animal("Tiger", "Orange", "Wild");

        System.out.println("Hashcode of dog: " + dog.hashCode() + "\nHashcode of cat: " + cat.hashCode() + "\nHashcode of tiger: " + tiger.hashCode());
    }
}
