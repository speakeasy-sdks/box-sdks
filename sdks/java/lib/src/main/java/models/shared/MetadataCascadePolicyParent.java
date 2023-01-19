package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataCascadePolicyParent
 * Represent the folder the policy is applied to.
**/
public class MetadataCascadePolicyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataCascadePolicyParent withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public MetadataCascadePolicyParentTypeEnum type;
    public MetadataCascadePolicyParent withType(MetadataCascadePolicyParentTypeEnum type) {
        this.type = type;
        return this;
    }
}