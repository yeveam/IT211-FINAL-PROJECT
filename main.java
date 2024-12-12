import java.util.Scanner;

public class main {
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
}
