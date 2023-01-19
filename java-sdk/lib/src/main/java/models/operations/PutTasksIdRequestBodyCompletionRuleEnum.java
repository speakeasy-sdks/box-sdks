package .models.operations;


public enum PutTasksIdRequestBodyCompletionRuleEnum {
    ALL_ASSIGNEES("all_assignees"),
    ANY_ASSIGNEE("any_assignee");

    public final String value;

    private PutTasksIdRequestBodyCompletionRuleEnum(String value) {
        this.value = value;
    }
}
