package .models.shared;


public enum FolderFolderUploadEmailAccessEnum {
    OPEN("open"),
    COLLABORATORS("collaborators");

    public final String value;

    private FolderFolderUploadEmailAccessEnum(String value) {
        this.value = value;
    }
}
