package .models.shared;


public enum FolderTypeEnum {
    FOLDER("folder");

    public final String value;

    private FolderTypeEnum(String value) {
        this.value = value;
    }
}
