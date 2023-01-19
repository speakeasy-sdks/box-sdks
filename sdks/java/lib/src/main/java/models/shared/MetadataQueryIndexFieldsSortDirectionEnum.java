package .models.shared;


public enum MetadataQueryIndexFieldsSortDirectionEnum {
    ASC("asc"),
    DESC("desc");

    public final String value;

    private MetadataQueryIndexFieldsSortDirectionEnum(String value) {
        this.value = value;
    }
}
