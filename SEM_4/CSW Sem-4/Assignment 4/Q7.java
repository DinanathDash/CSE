import java.util.*;

class Address {
    String plotNo, at, post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        Address address1 = new Address("123", "Main Street", "City A");
        Address address2 = new Address("456", "Park Avenue", "City B");

        addressMap.put("John Doe", address1);
        addressMap.put("Jane Smith", address2);

        Iterator<String> iterator = addressMap.keySet().iterator();
        System.out.println("TreeMap of Addresses:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressMap.get(name);
            System.out.println("Name: " + name + ", Address: Plot No. " + address.plotNo + ", At: " + address.at + ", Post: " + address.post);
        }
    }
}