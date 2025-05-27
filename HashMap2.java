import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        // Creating a catalog for the library using HashMap with initialization
        Map<String, String> libraryCatalog = new HashMap<>(Map.of(
            "book1", "A Tale of Two Cities",
            "book2", "To Kill a Mockingbird",
            "book3", "1984"
        ));

        // Removing an existing book from the catalog
        libraryCatalog.remove("book1");
        System.out.println("Removed book1: " + libraryCatalog.get("book1")); // Output: "Removed book1: null"
    }
}
