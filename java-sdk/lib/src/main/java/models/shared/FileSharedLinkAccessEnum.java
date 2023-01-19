package .models.shared;


public enum FileSharedLinkAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    public final String value;

    private FileSharedLinkAccessEnum(String value) {
        this.value = value;
    }
}
