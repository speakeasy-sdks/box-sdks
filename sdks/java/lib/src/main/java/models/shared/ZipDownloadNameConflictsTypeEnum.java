package .models.shared;


public enum ZipDownloadNameConflictsTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private ZipDownloadNameConflictsTypeEnum(String value) {
        this.value = value;
    }
}
