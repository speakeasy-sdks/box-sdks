package .models.operations;


public enum PostMetadataCascadePoliciesRequestBodyScopeEnum {
    GLOBAL("global"),
    ENTERPRISE("enterprise");

    public final String value;

    private PostMetadataCascadePoliciesRequestBodyScopeEnum(String value) {
        this.value = value;
    }
}
