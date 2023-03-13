import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);
        
        // FIRST TYPE
        prices.stream()
            .filter(price -> {
                return price > 100;
            }).map(price -> {
                return price - 20;
            }).sorted((right, left) -> {
                return right.compareTo(left);
            }).map(price -> {
                return "$" + price;
            }).forEach(price -> {
                System.out.println(price);
            }
        );

        // SECOND TYPE
        prices.stream()
            .filter(price -> price > 100)
            .map(price -> price - 20)
            .sorted((right, left) -> right.compareTo(left))
            .map(price -> "$" + price)
            .forEach(price -> System.out.println(price));


    }
}
