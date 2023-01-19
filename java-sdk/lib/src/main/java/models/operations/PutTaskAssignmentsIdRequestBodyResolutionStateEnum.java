package .models.operations;


public enum PutTaskAssignmentsIdRequestBodyResolutionStateEnum {
    COMPLETED("completed"),
    INCOMPLETE("incomplete"),
    APPROVED("approved"),
    REJECTED("rejected");

    public final String value;

    private PutTaskAssignmentsIdRequestBodyResolutionStateEnum(String value) {
        this.value = value;
    }
}
