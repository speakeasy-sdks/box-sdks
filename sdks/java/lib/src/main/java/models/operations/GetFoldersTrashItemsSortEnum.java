package .models.operations;


public enum GetFoldersTrashItemsSortEnum {
    ID("id"),
    NAME("name"),
    DATE("date"),
    SIZE("size");

    public final String value;

    private GetFoldersTrashItemsSortEnum(String value) {
        this.value = value;
    }
}
