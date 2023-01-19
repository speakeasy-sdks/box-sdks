package .models.operations;


public enum PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFilesIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
