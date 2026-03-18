
    /**
     * UseCase2RoomInitialization
     * * This class introduces object modeling through inheritance and abstraction.
     * Version 2.0: Refactored to include Domain Models.
     */

// --- 1. Abstract Domain Model ---
    abstract class Room {
        private String type;
        private int beds;
        private String size;
        private double price;

        public Room(String type, int beds, String size, double price) {
            this.type = type;
            this.beds = beds;
            this.size = size;
            this.price = price;
        }

        // Encapsulation: Using methods to access data
        public void displayRoomInfo() {
            System.out.println(type + ":");
            System.out.println("Beds: " + beds);
            System.out.println("Size: " + size);
            System.out.println("Price per night: " + price);
        }
    }

    // --- 2. Concrete Classes (Inheritance) ---
    class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 1, "250 sqft", 1500.0);
        }
    }

    class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 2, "400 sqft", 2500.0);
        }
    }

    class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Suite Room", 3, "750 sqft", 5000.0);
        }
    }

    // --- 3. Main Application ---
    public class BookMyStay {
        public static void main(String[] args) {

            System.out.println("Hotel Room Initialization\n");

            // Step 1: Initialize Room objects (Polymorphism)
            Room single = new SingleRoom();
            Room doubleRoom = new DoubleRoom();
            Room suite = new SuiteRoom();

            // Step 2: Static Availability (Simple Variables)
            int singleAvailable = 5;
            int doubleAvailable = 3;
            int suiteAvailable = 2;

            // Step 3: Print Details to Console
            single.displayRoomInfo();
            System.out.println("Available: " + singleAvailable + "\n");

            doubleRoom.displayRoomInfo();
            System.out.println("Available: " + doubleAvailable + "\n");

            suite.displayRoomInfo();
            System.out.println("Available: " + suiteAvailable);
        }
    }