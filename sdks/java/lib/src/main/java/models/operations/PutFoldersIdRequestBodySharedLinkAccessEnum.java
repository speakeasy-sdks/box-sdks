package .models.operations;


public enum PutFoldersIdRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFoldersIdRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
