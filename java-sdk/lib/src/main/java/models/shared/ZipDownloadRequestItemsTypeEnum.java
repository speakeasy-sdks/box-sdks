package .models.shared;


public enum ZipDownloadRequestItemsTypeEnum {
    FILE("file"),
    FOLDER("folder.");

    public final String value;

    private ZipDownloadRequestItemsTypeEnum(String value) {
        this.value = value;
    }
}
