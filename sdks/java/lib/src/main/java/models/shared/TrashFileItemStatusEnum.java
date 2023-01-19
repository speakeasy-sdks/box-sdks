package .models.shared;


public enum TrashFileItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashFileItemStatusEnum(String value) {
        this.value = value;
    }
}
