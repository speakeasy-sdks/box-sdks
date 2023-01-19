package .models.shared;


public enum FileSharedLinkEffectiveAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private FileSharedLinkEffectiveAccessEnum(String value) {
        this.value = value;
    }
}
