package .models.operations;


public enum PostTasksRequestBodyItemTypeEnum {
    FILE("file");

    public final String value;

    private PostTasksRequestBodyItemTypeEnum(String value) {
        this.value = value;
    }
}
