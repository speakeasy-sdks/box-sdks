package .models.shared;


public enum TrashFileRestoredItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashFileRestoredItemStatusEnum(String value) {
        this.value = value;
    }
}
