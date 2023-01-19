package .models.operations;


public enum PutFilesIdRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFilesIdRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
