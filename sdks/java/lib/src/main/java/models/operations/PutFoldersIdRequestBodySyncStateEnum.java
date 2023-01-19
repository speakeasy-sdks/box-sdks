package .models.operations;


public enum PutFoldersIdRequestBodySyncStateEnum {
    SYNCED("synced"),
    NOT_SYNCED("not_synced"),
    PARTIALLY_SYNCED("partially_synced");

    public final String value;

    private PutFoldersIdRequestBodySyncStateEnum(String value) {
        this.value = value;
    }
}
