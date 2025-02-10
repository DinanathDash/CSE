public class Q6 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<String> stringBoxRef1 = stringBox;
        Box<String> stringBoxRef2 = stringBox;
        stringBoxRef1.set("World");
        System.out.println(stringBoxRef2.get()); 
        Box<Integer> integerBox = new Box<>(1);
        Box<Integer> integerBoxRef1 = integerBox;
        Box<Integer> integerBoxRef2 = integerBox;
        integerBoxRef1.set(2);
        System.out.println(integerBoxRef2.get());
        Box<Object> objectBox = new Box<>("Hello");
        Box<Object> objectBoxRef1 = objectBox;
        Box<Object> objectBoxRef2 = objectBox;
        objectBoxRef1.set("World");
        System.out.println(objectBoxRef2.get()); 
        objectBoxRef1.set(3);
        System.out.println(objectBoxRef2.get());
    }
}
class Box<T>{
    public T t;
    public Box(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}