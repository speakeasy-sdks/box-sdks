package .models.shared;


public enum WorkflowTypeEnum {
    WORKFLOW("workflow");

    public final String value;

    private WorkflowTypeEnum(String value) {
        this.value = value;
    }
}
