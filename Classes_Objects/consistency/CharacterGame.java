public class CharacterGame {
    // Private attributes
    private int currentHealth;
    private String name;
    private String status;

    // Constructor to ensure consistent initial state
    public CharacterGame(int initialHealth, String initialName) {
        setName(initialName);          // Use setter to validate name
        setCurrentHealth(initialHealth); // Use setter to set health and status
    }

    // Getter for currentHealth
    public int getCurrentHealth() {
        return currentHealth;
    }

    // Setter for currentHealth, also updates status
    public void setCurrentHealth(int currentHealth) {
        // Keep health within 0-100
        if (currentHealth < 0) {
            this.currentHealth = 0;
        } else if (currentHealth > 100) {
            this.currentHealth = 100;
        } else {
            this.currentHealth = currentHealth;
        }

        // Update status based on current health
        if (this.currentHealth > 0) {
            status = "alive";
        } else {
            status = "dead";
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        // If invalid, do nothing (name remains unchanged)
    }

    // Getter for status (read-only)
    public String getStatus() {
        return status;
    }

    // Method to decrease health using setter
    public void takeDamage(int damageAmount) {
        setCurrentHealth(currentHealth - damageAmount);
    }

    // Method to increase health using setter
    public void receiveHealing(int healingAmount) {
        setCurrentHealth(currentHealth + healingAmount);
    }
}
