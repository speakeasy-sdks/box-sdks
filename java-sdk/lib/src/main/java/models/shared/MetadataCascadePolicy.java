package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataCascadePolicy
 * A metadata cascade policy automatically applies a metadata template instance
 * to all the files and folders within the targeted folder.
**/
public class MetadataCascadePolicy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataCascadePolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_enterprise")
    public MetadataCascadePolicyOwnerEnterprise ownerEnterprise;
    public MetadataCascadePolicy withOwnerEnterprise(MetadataCascadePolicyOwnerEnterprise ownerEnterprise) {
        this.ownerEnterprise = ownerEnterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public MetadataCascadePolicyParent parent;
    public MetadataCascadePolicy withParent(MetadataCascadePolicyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public MetadataCascadePolicyScopeEnum scope;
    public MetadataCascadePolicy withScope(MetadataCascadePolicyScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("templateKey")
    public String templateKey;
    public MetadataCascadePolicy withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public MetadataCascadePolicyTypeEnum type;
    public MetadataCascadePolicy withType(MetadataCascadePolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}