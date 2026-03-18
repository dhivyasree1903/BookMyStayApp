import java.util.HashSet;
import java.util.Set;

/**
 * UseCase3BogieUniqueness
 * Version 3.0: Transitioning from List to Set to enforce business rules.
 * Focus: HashSet and Automatic Deduplication.
 */
public class BookMyStay
{

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management System v3.0 ===");
        System.out.println("Enforcing Unique Bogie Registration...\n");

        // 1. Initialize a HashSet to store Bogie IDs
        // HashSet does not allow duplicate elements.
        Set<String> bogieIds = new HashSet<>();

        // 2. Adding Bogie IDs (including intentional duplicates)
        System.out.println("Registering Bogies...");

        bogieIds.add("BG101"); // First entry
        bogieIds.add("BG102"); // Unique
        bogieIds.add("BG103"); // Unique

        // Attempting to add duplicates
        System.out.println("Error Simulation: Attempting to add duplicate ID 'BG101'...");
        bogieIds.add("BG101");

        System.out.println("Error Simulation: Attempting to add duplicate ID 'BG102'...");
        bogieIds.add("BG102");

        // 3. Displaying the final consist
        System.out.println("\nFinal Unique Bogie Consist:");
        System.out.println("--------------------------------------");

        for (String id : bogieIds) {
            System.out.println("Bogie ID: " + id);
        }

        // 4. Verification
        System.out.println("--------------------------------------");
        System.out.println("Total Unique Bogies Registered: " + bogieIds.size());
        System.out.println("Note: Notice that duplicate entries were automatically ignored.");

        System.out.println("\nRegistration process complete.");
    }
}
