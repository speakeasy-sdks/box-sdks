package .models.operations;


public enum PostCommentsRequestBodyItemTypeEnum {
    FILE("file"),
    COMMENT("comment");

    public final String value;

    private PostCommentsRequestBodyItemTypeEnum(String value) {
        this.value = value;
    }
}
