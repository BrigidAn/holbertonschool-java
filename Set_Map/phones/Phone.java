public class Phone {
    private String areaCode;
    private String number;

    // Constructor
    public Phone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    // toString override
    @Override
    public String toString() {
        return "(" + areaCode + ") " + number;
    }
}
