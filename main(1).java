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

        // Accessing a book's title
        String title1 = libraryCatalog.get("book1");
        if (title1 != null)
            System.out.println(title1); // Output: "A Tale of Two Cities"
        else
            System.out.println("Key not found");

        // Accessing a nonexistent key
        String titleNonexistent = libraryCatalog.get("book100");
        if (titleNonexistent != null)
            System.out.println(titleNonexistent);
        else
            System.out.println("Key not found"); // Output: "Key not found"
    }
}
