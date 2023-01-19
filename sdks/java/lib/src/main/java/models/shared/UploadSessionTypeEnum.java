package .models.shared;


public enum UploadSessionTypeEnum {
    UPLOAD_SESSION("upload_session");

    public final String value;

    private UploadSessionTypeEnum(String value) {
        this.value = value;
    }
}
