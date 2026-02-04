public class CharacterGame {
    // Private attributes
    private int currentHealth;
    private String name;

    // Getter for currentHealth
    public int getCurrentHealth() {
        return currentHealth;
    }

    // Setter for currentHealth
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to decrease health
    public void takeDamage(int damageAmount) {
        currentHealth -= damageAmount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    // Method to increase health
    public void receiveHealing(int healingAmount) {
        currentHealth += healingAmount;
        if (currentHealth > 100) {
            currentHealth = 100;
        }
    }
}
