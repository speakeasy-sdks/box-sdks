package .models.operations;


public enum PostWebLinksRequestBodySharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private PostWebLinksRequestBodySharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
