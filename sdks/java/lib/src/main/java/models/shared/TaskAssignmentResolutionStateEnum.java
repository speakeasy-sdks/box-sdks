package .models.shared;


public enum TaskAssignmentResolutionStateEnum {
    COMPLETED("completed"),
    INCOMPLETE("incomplete"),
    APPROVED("approved"),
    REJECTED("rejected");

    public final String value;

    private TaskAssignmentResolutionStateEnum(String value) {
        this.value = value;
    }
}
