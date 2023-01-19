package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RetentionPolicyAssignmentAssignedTo
 * The `type` and `id` of the content that is under
 * retention. The `type` can either be `folder`
 * `enterprise`, or `metadata_template`.
**/
public class RetentionPolicyAssignmentAssignedTo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public RetentionPolicyAssignmentAssignedTo withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public RetentionPolicyAssignmentAssignedToTypeEnum type;
    public RetentionPolicyAssignmentAssignedTo withType(RetentionPolicyAssignmentAssignedToTypeEnum type) {
        this.type = type;
        return this;
    }
}