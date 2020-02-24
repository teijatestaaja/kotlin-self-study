public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String initDesc, boolean value) {
        description = initDesc;
        isCompleted = value;
    }

    public String getDescription() {
        return description;
    }

    public boolean getCompleted() {
        return isCompleted;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
