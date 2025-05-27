import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        HashMap<String, String> libraryCatalog = new HashMap<>();
        libraryCatalog.put("book1", "A Tale of Two Cities");
        libraryCatalog.put("book2", "To Kill a Mockingbird");
        libraryCatalog.put("book3", "1984");

        // Looping over the HashMap
        for (Map.Entry<String, String> entry : libraryCatalog.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
