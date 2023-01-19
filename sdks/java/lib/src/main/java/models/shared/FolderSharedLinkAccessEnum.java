package .models.shared;


public enum FolderSharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private FolderSharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
