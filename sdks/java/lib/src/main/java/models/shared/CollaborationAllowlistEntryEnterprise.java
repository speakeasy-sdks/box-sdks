package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * CollaborationAllowlistEntryEnterprise
 * A representation of a Box enterprise
**/
public class CollaborationAllowlistEntryEnterprise {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CollaborationAllowlistEntryEnterprise withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public CollaborationAllowlistEntryEnterprise withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollaborationAllowlistEntryEnterpriseTypeEnum type;
    public CollaborationAllowlistEntryEnterprise withType(CollaborationAllowlistEntryEnterpriseTypeEnum type) {
        this.type = type;
        return this;
    }
}