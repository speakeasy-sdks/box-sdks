package .models.operations;


public enum PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
