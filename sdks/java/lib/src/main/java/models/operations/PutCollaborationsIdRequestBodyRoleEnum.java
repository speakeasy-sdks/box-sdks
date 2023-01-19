package .models.operations;


public enum PutCollaborationsIdRequestBodyRoleEnum {
    EDITOR("editor"),
    VIEWER("viewer"),
    PREVIEWER("previewer"),
    UPLOADER("uploader"),
    PREVIEWER_UPLOADER("previewer uploader"),
    VIEWER_UPLOADER("viewer uploader"),
    CO_OWNER("co-owner"),
    OWNER("owner");

    public final String value;

    private PutCollaborationsIdRequestBodyRoleEnum(String value) {
        this.value = value;
    }
}
