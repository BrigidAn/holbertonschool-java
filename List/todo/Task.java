public class Task {
    private String description;
    private boolean isDone;
    private int identifier;

    // Constructor
    public Task(String description, int identifier) throws Exception {
        if (description == null || description.isEmpty()) {
            throw new Exception("Invalid task description");
        }
        this.description = description;
        this.identifier = identifier;
        this.isDone = false;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getIdentifier() {
        return identifier;
    }

    // Modify description
    public void modifyDescription(String newDescription) throws Exception {
        if (newDescription == null || newDescription.isEmpty()) {
            throw new Exception("Invalid task description");
        }
        this.description = newDescription;
    }

    // Internal setters for status
    public void setDone(boolean done) {
        this.isDone = done;
    }
}
