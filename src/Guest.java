class Guest {
    private String name;
    private String contactNumber;
    private String passportNumber;

    public Guest(String name, String contactNumber, String passportNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    String newLine = System.getProperty("line.separator");

    @Override
    public String toString() {
        return "Guest " + name + ":" + newLine +
                "Contact Number: " + contactNumber + " | " + "Passport Number: " + passportNumber
                ;
    }
}