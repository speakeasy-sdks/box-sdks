package .models.operations;


public enum PostTaskAssignmentsRequestBodyTaskTypeEnum {
    TASK("task");

    public final String value;

    private PostTaskAssignmentsRequestBodyTaskTypeEnum(String value) {
        this.value = value;
    }
}
