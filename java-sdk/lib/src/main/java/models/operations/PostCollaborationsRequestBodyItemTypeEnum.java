package .models.operations;


public enum PostCollaborationsRequestBodyItemTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private PostCollaborationsRequestBodyItemTypeEnum(String value) {
        this.value = value;
    }
}
