package .models.operations;


public enum PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum {
    ADD("add"),
    REPLACE("replace"),
    REMOVE("remove"),
    TEST("test"),
    MOVE("move"),
    COPY("copy");

    public final String value;

    private PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum(String value) {
        this.value = value;
    }
}
