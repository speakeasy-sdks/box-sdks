package .models.shared;


public enum FileRequestFolderBaseTypeEnum {
    FOLDER("folder");

    public final String value;

    private FileRequestFolderBaseTypeEnum(String value) {
        this.value = value;
    }
}
