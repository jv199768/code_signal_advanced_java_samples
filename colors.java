import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("blue");

        HashMap<String, Integer> colorMap = new HashMap<>();

        // Start the loop to iterate over each color
        for (String color : colors) {

            // If the color is present in our HashMap, increment its value by 1
            if (colorMap.containsKey(color)) {
                colorMap.put(color, colorMap.get(color) + 1);
            } else {
                // If the color isn't present, it means we're encountering this color in our list for the first time.
                // In this case, we add it to our HashMap and set its value to 1
                colorMap.put(color, 1);
            }
        }

        // Print our HashMap with counts
        for (String key : colorMap.keySet()) {
            System.out.println(key + ": " + colorMap.get(key));
        }
    }
}
