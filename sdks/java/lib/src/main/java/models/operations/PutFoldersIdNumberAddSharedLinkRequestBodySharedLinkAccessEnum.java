package .models.operations;


public enum PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
