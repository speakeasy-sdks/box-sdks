package .models.shared;


public enum FolderSharedLinkEffectiveAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private FolderSharedLinkEffectiveAccessEnum(String value) {
        this.value = value;
    }
}
