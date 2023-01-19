package .models.operations;


public enum PutFilesIdRequestBodyPermissionsCanDownloadEnum {
    OPEN("open"),
    COMPANY("company");

    public final String value;

    private PutFilesIdRequestBodyPermissionsCanDownloadEnum(String value) {
        this.value = value;
    }
}
