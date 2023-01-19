package .models.shared;


public enum MetadataCascadePolicyScopeEnum {
    GLOBAL("global"),
    ENTERPRISE_WILDCARD("enterprise_*");

    public final String value;

    private MetadataCascadePolicyScopeEnum(String value) {
        this.value = value;
    }
}
