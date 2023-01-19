package .models.shared;


public enum TrashWebLinkRestoredItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashWebLinkRestoredItemStatusEnum(String value) {
        this.value = value;
    }
}
