package .models.operations;


public enum PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
