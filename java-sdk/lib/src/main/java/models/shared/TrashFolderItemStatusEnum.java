package .models.shared;


public enum TrashFolderItemStatusEnum {
    ACTIVE("active"),
    TRASHED("trashed"),
    DELETED("deleted");

    public final String value;

    private TrashFolderItemStatusEnum(String value) {
        this.value = value;
    }
}
