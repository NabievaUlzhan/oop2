import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        Room room1 = new SingleRoom(101, 50.0);
        Room room2 = new DoubleRoom(102, 100.0);
        Room room3 = new DoubleRoom(103, 100.0);

        Guest guest1 = new Guest("Jon", "8-707-521-22-44", "65489789471");
        Guest guest2 = new Guest("Alicent", "8-702-745-63-85", "46846455123");

        Booking booking1 = new Booking(room1, guest1, "2024-12-01", "2024-12-02");
        Booking booking2 = new Booking(room2, guest2, "2024-12-03", "2024-12-06");
        Booking booking3 = new Booking(room3, null, null, null);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);
        bookings.add(booking3);

        System.out.println("Hotel Booking System" + newLine);

        List<Room> availableRooms = rooms.stream().filter(room -> !room.isBooked()).collect(Collectors.toList());
        System.out.println("Available Rooms: ");
        availableRooms.forEach(System.out::println);
        System.out.println();

        Room searchedRoom = rooms.stream().filter(room -> room.getRoomNumber() == 102).findFirst().orElse(null);
        System.out.println("Searched Room: " + newLine+ searchedRoom + newLine);

        List<Booking> sortedBookings = bookings.stream().sorted(Comparator.comparingDouble(Booking::calculateTotalPrice)).collect(Collectors.toList());
        System.out.println("Sorted Bookings By Price: ");
        sortedBookings.forEach(System.out::println);

        System.out.println("Are room 101 and 102 equal? " + room1.equals(room2));
    }
}
