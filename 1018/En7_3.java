import java.util.HashMap;
import java.util.Map;

public class En7_3 {
    public static void main(String[] args) {
        Map<String, String> fruits = new HashMap<>();
        fruits.put("りんご", "apple");
        fruits.put("オレンジ", "orange");
        fruits.put("バナナ", "banana");

        System.out.println(fruits.get("りんご"));
    }
}
