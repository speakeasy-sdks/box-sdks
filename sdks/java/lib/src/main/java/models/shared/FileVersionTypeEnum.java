package .models.shared;


public enum FileVersionTypeEnum {
    FILE_VERSION("file_version");

    public final String value;

    private FileVersionTypeEnum(String value) {
        this.value = value;
    }
}
