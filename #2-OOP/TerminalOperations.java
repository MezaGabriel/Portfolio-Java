import java.util.Arrays;
import java.util.List;

public class TerminalOperations {
    
    public static void main(String[] args) {
        
        /*********************forEach*******************/
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "WildFlower87", "NattyCombo");
        usernames.stream()
            .map(username -> username.toUpperCase())
            .forEach(username -> System.out.println(username));
        
        /*********************toList*******************/
        List<String> upperUsernames = usernames.stream()
            .map(username -> username.toUpperCase())
            .toList();

        System.out.println(upperUsernames);

        /*********************reduce*******************/
        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream().reduce(0.00, ((x, y) -> x + y));
        System.out.println("\nYour total earnings are $ " + totalEarnings);

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 1.00);
        Double fundsRemaining = expenses.stream().reduce(100.00, ((x, y) -> x - y));
        System.out.println("\nYour funds remaining are $ " + fundsRemaining);
    
        /*********************findFirst****************/
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate");
        System.out.println("\nDo you guys sell coffee? ");

        String result = aisles.stream()
            .filter(aisle -> aisle.equals("coffee"))
            .findFirst()
            .orElse(null);

        String response = result == null ? "No we don't!" : "Sure we do!";
        System.out.println(response);

        /*********************count*********************/
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 4 repeat?");

        long count = numbers.stream().filter(number -> number == 4).count();
        System.out.println("The number 4 repeats " + count + " times.");
        
    }
}
