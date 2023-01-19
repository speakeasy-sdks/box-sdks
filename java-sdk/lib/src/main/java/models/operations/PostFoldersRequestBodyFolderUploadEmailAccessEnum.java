package .models.operations;


public enum PostFoldersRequestBodyFolderUploadEmailAccessEnum {
    OPEN("open"),
    COLLABORATORS("collaborators");

    public final String value;

    private PostFoldersRequestBodyFolderUploadEmailAccessEnum(String value) {
        this.value = value;
    }
}
