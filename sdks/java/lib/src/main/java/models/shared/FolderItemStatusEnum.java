package .models.shared;


public enum FolderItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private FolderItemStatusEnum(String value) {
        this.value = value;
    }
}
