package .models.operations;


public enum PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum {
    STRING("string"),
    FLOAT("float"),
    DATE("date"),
    ENUM_("enum"),
    MULTI_SELECT("multiSelect");

    public final String value;

    private PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum(String value) {
        this.value = value;
    }
}
