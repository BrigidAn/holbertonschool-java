public class PositiveInteger {

    private int value;

    // Constructor receiving int
    public PositiveInteger(int value) {
        setValue(value);
    }

    // Constructor receiving String
    public PositiveInteger(String value) {
        try {
            int parsedValue = Integer.parseInt(value);
            setValue(parsedValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = value;
    }

    // Included because Program.java calls setValor (typo intentional in project)
    public void setValor(int value) {
        setValue(value);
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
