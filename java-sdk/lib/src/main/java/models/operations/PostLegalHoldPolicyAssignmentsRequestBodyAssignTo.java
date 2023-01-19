package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostLegalHoldPolicyAssignmentsRequestBodyAssignTo
 * The item to assign the policy to
**/
public class PostLegalHoldPolicyAssignmentsRequestBodyAssignTo {
    @JsonProperty("id")
    public String id;
    public PostLegalHoldPolicyAssignmentsRequestBodyAssignTo withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum type;
    public PostLegalHoldPolicyAssignmentsRequestBodyAssignTo withType(PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum type) {
        this.type = type;
        return this;
    }
}