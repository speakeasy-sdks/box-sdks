package .models.shared;


public enum ZipDownloadStatusStateEnum {
    IN_PROGRESS("in_progress"),
    FAILED("failed"),
    SUCCESS("success");

    public final String value;

    private ZipDownloadStatusStateEnum(String value) {
        this.value = value;
    }
}
