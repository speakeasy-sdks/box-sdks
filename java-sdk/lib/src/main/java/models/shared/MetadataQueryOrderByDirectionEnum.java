package .models.shared;


public enum MetadataQueryOrderByDirectionEnum {
    ASC_UPPER("ASC"),
    DESC_UPPER("DESC"),
    ASC_LOWER("asc"),
    DESC_LOWER("desc");

    public final String value;

    private MetadataQueryOrderByDirectionEnum(String value) {
        this.value = value;
    }
}
