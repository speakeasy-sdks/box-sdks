package .models.shared;


public enum WebLinkSharedLinkEffectiveAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private WebLinkSharedLinkEffectiveAccessEnum(String value) {
        this.value = value;
    }
}
