package .models.shared;


public enum FileRequestTypeEnum {
    FILE_REQUEST("file_request");

    public final String value;

    private FileRequestTypeEnum(String value) {
        this.value = value;
    }
}
