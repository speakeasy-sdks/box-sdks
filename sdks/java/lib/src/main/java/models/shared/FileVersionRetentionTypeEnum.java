package .models.shared;


public enum FileVersionRetentionTypeEnum {
    FILE_VERSION_RETENTION("file_version_retention");

    public final String value;

    private FileVersionRetentionTypeEnum(String value) {
        this.value = value;
    }
}
