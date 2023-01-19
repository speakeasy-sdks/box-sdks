package .models.shared;


public enum TrashWebLinkItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashWebLinkItemStatusEnum(String value) {
        this.value = value;
    }
}
