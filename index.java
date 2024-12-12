
public class index {
    // Room reservation logic
    private boolean[] rooms;
    
    // Constructor to initialize rooms as available (true means available)
    public index(int totalRooms) {
        rooms = new boolean[totalRooms];
        for (int i = 0; i < totalRooms; i++) {
            rooms[i] = true; // All rooms are available at the start
        }
    }

    // Method to show available rooms
    private void showAvailableRooms() {
        System.out.print("Available Rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i]) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println(); // New line for clarity
    }
}

    public static void main (String[] args) {
        RoomReservationWithLogin system = new RoomReservationWithLogin(5); // Example with 5 rooms
        
        // Handle login
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        
        while (!loggedIn) {
            loggedIn = system.handleLogin();
        }

        // After login, show available rooms and allow reservation/cancellation
        while (true) {
            system.showAvailableRooms();
            
            System.out.println("Welcome to CICS Reservation Room!");
            System.out.println("Choose an option:");
            System.out.println("1. Reserve Room");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter Room Number to Reserve: ");
                int roomNumber = scanner.nextInt();
                system.reserveRoom(roomNumber);
            } else if (choice == 2) {
                System.out.print("Enter Room Number to Cancel Reservation: ");
                int roomNumber = scanner.nextInt();
                system.cancelReservation(roomNumber);
            } else if (choice == 3) {
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
