public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String initDesc, boolean initValue) {
        description = initDesc;
        isCompleted = initValue;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setIsCompleted(boolean completed) {
        isCompleted = completed;
    }
}
