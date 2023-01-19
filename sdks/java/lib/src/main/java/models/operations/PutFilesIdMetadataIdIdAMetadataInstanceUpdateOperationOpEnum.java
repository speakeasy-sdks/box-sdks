package .models.operations;


public enum PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum {
    ADD("add"),
    REPLACE("replace"),
    REMOVE("remove"),
    TEST("test"),
    MOVE("move"),
    COPY("copy");

    public final String value;

    private PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperationOpEnum(String value) {
        this.value = value;
    }
}
