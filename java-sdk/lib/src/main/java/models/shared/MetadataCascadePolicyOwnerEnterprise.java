package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataCascadePolicyOwnerEnterprise
 * The enterprise that owns this policy.
**/
public class MetadataCascadePolicyOwnerEnterprise {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataCascadePolicyOwnerEnterprise withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public MetadataCascadePolicyOwnerEnterpriseTypeEnum type;
    public MetadataCascadePolicyOwnerEnterprise withType(MetadataCascadePolicyOwnerEnterpriseTypeEnum type) {
        this.type = type;
        return this;
    }
}