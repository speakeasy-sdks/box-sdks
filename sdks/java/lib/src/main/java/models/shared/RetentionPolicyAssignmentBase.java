package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionPolicyAssignmentBase
 * A base representation of a retention policy assignment.
**/
public class RetentionPolicyAssignmentBase {
    @JsonProperty("id")
    public String id;
    public RetentionPolicyAssignmentBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public RetentionPolicyAssignmentBaseTypeEnum type;
    public RetentionPolicyAssignmentBase withType(RetentionPolicyAssignmentBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}