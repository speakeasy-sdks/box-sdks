package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostRetentionPolicyAssignmentsRequestBodyAssignTo
 * The item to assign the policy to
**/
public class PostRetentionPolicyAssignmentsRequestBodyAssignTo {
    @JsonProperty("id")
    public String id;
    public PostRetentionPolicyAssignmentsRequestBodyAssignTo withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum type;
    public PostRetentionPolicyAssignmentsRequestBodyAssignTo withType(PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum type) {
        this.type = type;
        return this;
    }
}