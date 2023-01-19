package .models.shared;


public enum CommentTypeEnum {
    COMMENT("comment");

    public final String value;

    private CommentTypeEnum(String value) {
        this.value = value;
    }
}
