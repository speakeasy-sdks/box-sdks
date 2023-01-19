package .models.shared;


public enum MetadataQueryIndexStatusEnum {
    BUILDING("building"),
    ACTIVE("active"),
    DISABLED("disabled");

    public final String value;

    private MetadataQueryIndexStatusEnum(String value) {
        this.value = value;
    }
}
