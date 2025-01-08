class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    String newLine = System.getProperty("line.separator");

    @Override
    public String toString() {
        return "Room " + roomNumber + ":" + newLine +
                "Type: " + roomType + " | " + "Price: $" + price + " | " + "IsBooked: " + isBooked
                ;
    }
}