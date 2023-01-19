package .models.shared;


public enum TaskCompletionRuleEnum {
    ALL_ASSIGNEES("all_assignees"),
    ANY_ASSIGNEE("any_assignee");

    public final String value;

    private TaskCompletionRuleEnum(String value) {
        this.value = value;
    }
}
