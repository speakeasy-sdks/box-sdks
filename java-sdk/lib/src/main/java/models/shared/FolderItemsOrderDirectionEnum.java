package .models.shared;


public enum FolderItemsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private FolderItemsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
