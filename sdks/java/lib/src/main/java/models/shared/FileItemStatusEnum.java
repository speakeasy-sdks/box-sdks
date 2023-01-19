package .models.shared;


public enum FileItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private FileItemStatusEnum(String value) {
        this.value = value;
    }
}
