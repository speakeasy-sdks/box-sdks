package .models.operations;


public enum PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
