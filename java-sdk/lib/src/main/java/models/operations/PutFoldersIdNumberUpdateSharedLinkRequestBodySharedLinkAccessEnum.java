package .models.operations;


public enum PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
