package .models.operations;


public enum PostFoldersRequestBodySyncStateEnum {
    SYNCED("synced"),
    NOT_SYNCED("not_synced"),
    PARTIALLY_SYNCED("partially_synced");

    public final String value;

    private PostFoldersRequestBodySyncStateEnum(String value) {
        this.value = value;
    }
}
