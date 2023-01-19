package .models.shared;


public enum TrashFolderRestoredItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashFolderRestoredItemStatusEnum(String value) {
        this.value = value;
    }
}
