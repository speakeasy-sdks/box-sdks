package .models.shared;


public enum TrashFolderTypeEnum {
    FOLDER("folder");

    public final String value;

    private TrashFolderTypeEnum(String value) {
        this.value = value;
    }
}
