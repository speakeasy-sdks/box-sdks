package .models.operations;


public enum PostTasksRequestBodyActionEnum {
    REVIEW("review"),
    COMPLETE("complete");

    public final String value;

    private PostTasksRequestBodyActionEnum(String value) {
        this.value = value;
    }
}
