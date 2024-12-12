import java.util.Scanner;

public class RoomReservationWithLogin {

    // Room reservation logic
    private boolean[] rooms;
    
    // Constructor to initialize rooms as available (true means available)
    public RoomReservationWithLogin(int totalRooms) {
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

    // Method to reserve a room
    private void reserveRoom(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number.");
            return;
        }

        if (rooms[roomNumber - 1]) {
            rooms[roomNumber - 1] = false; // Mark the room as reserved
            System.out.println("Room " + roomNumber + " has been reserved.");
            showAvailableRooms();  // Update available rooms list
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
        }
    }
// code ni shai
    // Method to cancel a reservation
    private void cancelReservation(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number.");
            return;
        }

        if (!rooms[roomNumber - 1]) {
            rooms[roomNumber - 1] = true; // Mark the room as available
            System.out.println("Reservation for Room " + roomNumber + " has been canceled.");
            showAvailableRooms();  // Update available rooms list
        } else {
            System.out.println("Room " + roomNumber + " is not reserved.");
        }
    }

    // Method to handle login
    private boolean handleLogin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
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
}