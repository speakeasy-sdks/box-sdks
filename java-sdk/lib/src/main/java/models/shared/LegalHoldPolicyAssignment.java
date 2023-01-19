package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * LegalHoldPolicyAssignment
 * Legal Hold Assignments are used to assign Legal Hold
 * Policies to Users, Folders, Files, or File Versions.
 * 
 * Creating a Legal Hold Assignment puts a hold
 * on the File-Versions that belong to the Assignment's
 * 'apply-to' entity.
**/
public class LegalHoldPolicyAssignment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("assigned_at")
    public OffsetDateTime assignedAt;
    public LegalHoldPolicyAssignment withAssignedAt(OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_by")
    public UserMini assignedBy;
    public LegalHoldPolicyAssignment withAssignedBy(UserMini assignedBy) {
        this.assignedBy = assignedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_to")
    public Object assignedTo;
    public LegalHoldPolicyAssignment withAssignedTo(Object assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("deleted_at")
    public OffsetDateTime deletedAt;
    public LegalHoldPolicyAssignment withDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public LegalHoldPolicyAssignment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legal_hold_policy")
    public LegalHoldPolicyMini legalHoldPolicy;
    public LegalHoldPolicyAssignment withLegalHoldPolicy(LegalHoldPolicyMini legalHoldPolicy) {
        this.legalHoldPolicy = legalHoldPolicy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public LegalHoldPolicyAssignmentTypeEnum type;
    public LegalHoldPolicyAssignment withType(LegalHoldPolicyAssignmentTypeEnum type) {
        this.type = type;
        return this;
    }
}