package .models.shared;


public enum TaskTypeEnum {
    TASK("task");

    public final String value;

    private TaskTypeEnum(String value) {
        this.value = value;
    }
}
