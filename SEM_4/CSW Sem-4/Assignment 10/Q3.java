import java.util.stream.Stream;
import java.util.function.Predicate;

public class Q3 {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };

        Stream<Integer> primeStream = Stream.iterate(2, n -> n + 1).filter(isPrime::test);

        System.out.println("First 10 prime numbers:");
        primeStream.limit(10).forEach(System.out::println);
    }
}
