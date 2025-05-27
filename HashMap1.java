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

        // Updating an existing book's title
        libraryCatalog.put("book1", "The Tell-Tale Heart");
        System.out.println("Updated book1: " + libraryCatalog.get("book1")); // Output: "Updated book1: The Tell-Tale Heart"

        // Adding a new book to the catalog
        libraryCatalog.put("book4", "Pride and Prejudice");
        System.out.println("Added book4: " + libraryCatalog.get("book4")); // Output: "Added book4: Pride and Prejudice"
    }
}
