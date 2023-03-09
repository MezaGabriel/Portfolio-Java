import java.util.Arrays;
import java.util.List;

public class HighOrderFunctionAndComparator {
    public static void main(String[] args) {
        List<Integer> integer = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);
        integer.sort((right, left) -> { 
            return right.compareTo(left);
        });
    }
}
