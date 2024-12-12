import java.util.Scanner;

public class reservation {
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
}
