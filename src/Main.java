//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        Room room1 = new Room(101, "Single", 50.0);
        Room room2 = new Room(102, "Double", 100.0);
        Room room3 = new Room(103, "Double", 100.0);

        Guest guest1 = new Guest("Jon", "8-707-521-22-44", "65489789471");
        Guest guest2 = new Guest("Alicent", "8-702-745-63-85", "46846455123");

        Booking booking1 = new Booking(room1, guest1, "2024-12-01", "2024-12-02");
        Booking booking2 = new Booking(room2, guest2, "2024-12-03", "2024-12-06");
        Booking booking3 = new Booking(room3, null, null, null);

        System.out.println("Hotel Booking System" + newLine);
//        System.out.println("Bookings:");
        System.out.println(booking1);
        System.out.println(booking2);
        System.out.println(booking3);

        System.out.println("Room 101 is " + (room1.isBooked()?"not available":"available"));
        System.out.println("Room 102 is " + (room2.isBooked()?"not available":"available"));
        System.out.println("Room 103 is " + (room3.isBooked()?"not available":"available"));
    }
}