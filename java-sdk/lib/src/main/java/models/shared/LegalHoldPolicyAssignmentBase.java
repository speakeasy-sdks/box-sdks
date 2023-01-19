package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * LegalHoldPolicyAssignmentBase
 * Legal Hold Assignments are used to assign Legal Hold
 * Policies to Users, Folders, Files, or File Versions.
 * 
 * Creating a Legal Hold Assignment puts a hold
 * on the File-Versions that belong to the Assignment's
 * 'apply-to' entity.
**/
public class LegalHoldPolicyAssignmentBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public LegalHoldPolicyAssignmentBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public LegalHoldPolicyAssignmentBaseTypeEnum type;
    public LegalHoldPolicyAssignmentBase withType(LegalHoldPolicyAssignmentBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}