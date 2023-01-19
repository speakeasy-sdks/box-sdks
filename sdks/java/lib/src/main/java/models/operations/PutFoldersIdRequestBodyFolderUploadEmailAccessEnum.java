package .models.operations;


public enum PutFoldersIdRequestBodyFolderUploadEmailAccessEnum {
    OPEN("open"),
    COLLABORATORS("collaborators");

    public final String value;

    private PutFoldersIdRequestBodyFolderUploadEmailAccessEnum(String value) {
        this.value = value;
    }
}
