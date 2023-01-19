package .models.shared;


public enum WebLinkSharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private WebLinkSharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
