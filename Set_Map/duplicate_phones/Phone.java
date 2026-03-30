import java.util.Objects;

public class Phone {
    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "(" + areaCode + ") " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Phone)) return false;

        Phone other = (Phone) obj;
        return areaCode.equals(other.areaCode) &&
               number.equals(other.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }
}
