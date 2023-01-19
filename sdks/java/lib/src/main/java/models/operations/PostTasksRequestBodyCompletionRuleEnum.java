package .models.operations;


public enum PostTasksRequestBodyCompletionRuleEnum {
    ALL_ASSIGNEES("all_assignees"),
    ANY_ASSIGNEE("any_assignee");

    public final String value;

    private PostTasksRequestBodyCompletionRuleEnum(String value) {
        this.value = value;
    }
}
