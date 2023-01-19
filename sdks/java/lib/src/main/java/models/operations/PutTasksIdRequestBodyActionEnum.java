package .models.operations;


public enum PutTasksIdRequestBodyActionEnum {
    REVIEW("review"),
    COMPLETE("complete");

    public final String value;

    private PutTasksIdRequestBodyActionEnum(String value) {
        this.value = value;
    }
}
