package .models.operations;


public enum PostCollaborationsRequestBodyAccessibleByTypeEnum {
    USER("user"),
    GROUP("group");

    public final String value;

    private PostCollaborationsRequestBodyAccessibleByTypeEnum(String value) {
        this.value = value;
    }
}
