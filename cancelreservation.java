public class cancelreservation {
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
}
