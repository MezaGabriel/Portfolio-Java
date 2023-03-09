import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollections {
    public static void main(String[] args) {
        
        // HASH MAP
        Map<String, Double> inventory = new HashMap<>();
        inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Apple", 1.99);

        // TREE MAP
        Map<Integer, Integer> tree = new TreeMap<>();
        int multiplier = 5;
        tree.put(1, multiplier*1);
        tree.put(2, multiplier*2);
        tree.put(3, multiplier*3);
        tree.put(4, multiplier*4);
        tree.put(5, multiplier*5);

    }
}
