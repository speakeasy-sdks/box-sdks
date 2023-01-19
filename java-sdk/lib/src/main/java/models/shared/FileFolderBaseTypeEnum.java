package .models.shared;


public enum FileFolderBaseTypeEnum {
    FOLDER("folder");

    public final String value;

    private FileFolderBaseTypeEnum(String value) {
        this.value = value;
    }
}
