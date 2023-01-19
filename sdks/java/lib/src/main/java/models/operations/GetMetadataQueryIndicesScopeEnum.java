package .models.operations;


public enum GetMetadataQueryIndicesScopeEnum {
    GLOBAL("global"),
    ENTERPRISE("enterprise");

    public final String value;

    private GetMetadataQueryIndicesScopeEnum(String value) {
        this.value = value;
    }
}
