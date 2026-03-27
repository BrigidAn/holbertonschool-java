public class Contact {
    private String name;
    private String phoneNumber;
    private NumberType type;

    // Constructor
    public Contact(String name, String phoneNumber, NumberType type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public NumberType getType() {
        return type;
    }
}
