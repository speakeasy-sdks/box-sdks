package .models.shared;


public enum WebLinkItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private WebLinkItemStatusEnum(String value) {
        this.value = value;
    }
}
