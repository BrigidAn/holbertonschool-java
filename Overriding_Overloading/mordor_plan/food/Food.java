package food;

public abstract class Food {

    protected int happinessPoints;

    public Food(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }

    public int getHappinessPoints() {
        return happinessPoints;
    }
}
