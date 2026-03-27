import java.util.*;

public class TodoList {
    private List<Task> tasks;

    // Constructor
    public TodoList() {
        tasks = new ArrayList<>();
    }

    // Add task
    public void addTask(Task task) throws Exception {
        for (Task t : tasks) {
            if (t.getIdentifier() == task.getIdentifier()) {
                throw new Exception("Task with identifier " + task.getIdentifier() + " already exists in the list");
            }
        }
        tasks.add(task);
    }

    // Mark task as done
    public boolean markTaskDone(int id) {
        for (Task t : tasks) {
            if (t.getIdentifier() == id) {
                t.setDone(true);
                return true;
            }
        }
        return false;
    }

    // Undo task
    public boolean undoTask(int id) {
        for (Task t : tasks) {
            if (t.getIdentifier() == id) {
                t.setDone(false);
                return true;
            }
        }
        return false;
    }

    // Mark all as done
    public void completeAll() {
        for (Task t : tasks) {
            t.setDone(true);
        }
    }

    // Undo all
    public void undoAll() {
        for (Task t : tasks) {
            t.setDone(false);
        }
    }

    // List tasks
    public void listTasks() {
        for (Task t : tasks) {
            String status = t.isDone() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + t.getIdentifier() + " - Description: " + t.getDescription());
        }
    }
}
