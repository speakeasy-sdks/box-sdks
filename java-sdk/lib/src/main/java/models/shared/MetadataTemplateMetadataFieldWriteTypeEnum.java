package .models.shared;


public enum MetadataTemplateMetadataFieldWriteTypeEnum {
    STRING("string"),
    FLOAT("float"),
    DATE("date"),
    ENUM_("enum"),
    MULTI_SELECT("multiSelect");

    public final String value;

    private MetadataTemplateMetadataFieldWriteTypeEnum(String value) {
        this.value = value;
    }
}
