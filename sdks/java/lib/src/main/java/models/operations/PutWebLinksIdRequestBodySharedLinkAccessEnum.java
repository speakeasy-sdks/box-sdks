package .models.operations;


public enum PutWebLinksIdRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutWebLinksIdRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
