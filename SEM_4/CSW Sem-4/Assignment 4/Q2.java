import java.util.*;
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Q2 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Satya", 25));
        userList.add(new User("Sujal", 30));
        userList.add(new User("Saily", 20));

        System.out.println("Initial List:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        Collections.sort(userList, Comparator.comparing(User::getAge));

        System.out.println("\nSorted List:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}
