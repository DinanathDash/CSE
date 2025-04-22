class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setVal(V value) {
        this.value = value;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(42, "Hello, World!");

        System.out.println("Key: " + p1.getKey());
        System.out.println("Value: " + p1.getVal());

        Pair<String, Double> p2 = new Pair<>("Pi", 3.14159);

        System.out.println("\nKey: " + p2.getKey());
        System.out.println("Value: " + p2.getVal());
    }
}
