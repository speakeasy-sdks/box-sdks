package .models.shared;


public enum TaskAssignmentTypeEnum {
    TASK_ASSIGNMENT("task_assignment");

    public final String value;

    private TaskAssignmentTypeEnum(String value) {
        this.value = value;
    }
}
