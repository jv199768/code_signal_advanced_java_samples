import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitBasket = new HashMap<>();
        fruitBasket.put("apples", 5);
        fruitBasket.put("bananas", 4);
        fruitBasket.put("oranges", 8);
        // A HashMap representing our fruit basket

        // Finding the maximum value
        int maxFruit = Collections.max(fruitBasket.values());
        System.out.println("The highest quantity of fruits is: " + maxFruit);
        // It outputs: "The highest quantity of fruits is: 8"

        // Finding the minimum value
        int minFruit = Collections.min(fruitBasket.values());
        System.out.println("The lowest quantity of fruits is: " + minFruit);
        // It outputs: "The lowest quantity of fruits is: 4"
    }
}
