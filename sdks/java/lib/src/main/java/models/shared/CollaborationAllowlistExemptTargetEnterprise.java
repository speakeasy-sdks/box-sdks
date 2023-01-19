package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationAllowlistExemptTargetEnterprise
 * A representation of a Box enterprise
**/
public class CollaborationAllowlistExemptTargetEnterprise {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CollaborationAllowlistExemptTargetEnterprise withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public CollaborationAllowlistExemptTargetEnterprise withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollaborationAllowlistExemptTargetEnterpriseTypeEnum type;
    public CollaborationAllowlistExemptTargetEnterprise withType(CollaborationAllowlistExemptTargetEnterpriseTypeEnum type) {
        this.type = type;
        return this;
    }
}