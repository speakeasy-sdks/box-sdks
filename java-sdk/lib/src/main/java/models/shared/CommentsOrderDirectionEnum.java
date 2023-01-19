package .models.shared;


public enum CommentsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private CommentsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
