package .models.operations;


public enum GetFoldersIdItemsSortEnum {
    ID("id"),
    NAME("name"),
    DATE("date"),
    SIZE("size");

    public final String value;

    private GetFoldersIdItemsSortEnum(String value) {
        this.value = value;
    }
}
