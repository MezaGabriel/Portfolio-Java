import java.util.Map;
import java.util.Hashtable;

public class HighOrderFunctionAndBiConsumer {
    public static void main(String[] args) {
        Map<String, Integer> coffeeRatings = new Hashtable<>();
        coffeeRatings.put("Starbucks House Blend", 7);
        coffeeRatings.put("Peet's French Roast", 8);
        coffeeRatings.put("Intelligentsia Black Cat", 9);
        coffeeRatings.put("Blue Bottle Three Africas", 10);
        
        System.out.println("\nMenu\n--------");

        coffeeRatings.forEach((key, value) -> {
            System.out.println("Coffee " + key + " Rating " + value);
        });
    }
}
