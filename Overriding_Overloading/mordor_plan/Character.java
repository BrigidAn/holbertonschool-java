import food.*;
import mood.*;

public class Character {

    private int happinessPoints;

    public void eat(Food[] foods) {
        for (Food food : foods) {
            happinessPoints += food.getHappinessPoints();
        }
    }

    public Mood getCurrentMood() {

        if (happinessPoints < -5) {
            return new Angry();
        } else if (happinessPoints >= -5 && happinessPoints <= 0) {
            return new Sad();
        } else if (happinessPoints >= 1 && happinessPoints <= 15) {
            return new Happy();
        } else {
            return new VeryHappy();
        }
    }

    @Override
    public String toString() {
        Mood mood = getCurrentMood();
        return happinessPoints + " - " + mood.getClass().getSimpleName();
    }
}
