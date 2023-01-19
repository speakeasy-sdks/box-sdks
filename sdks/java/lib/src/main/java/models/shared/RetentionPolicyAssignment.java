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
 * RetentionPolicyAssignment
 * A retention assignment represents a rule specifying
 * the files a retention policy retains.
 * Assignments can retain files based on their folder or metadata,
 * or hold all files in the enterprise.
**/
public class RetentionPolicyAssignment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("assigned_at")
    public OffsetDateTime assignedAt;
    public RetentionPolicyAssignment withAssignedAt(OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_by")
    public UserMini assignedBy;
    public RetentionPolicyAssignment withAssignedBy(UserMini assignedBy) {
        this.assignedBy = assignedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_to")
    public RetentionPolicyAssignmentAssignedTo assignedTo;
    public RetentionPolicyAssignment withAssignedTo(RetentionPolicyAssignmentAssignedTo assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter_fields")
    public RetentionPolicyAssignmentFilterFields[] filterFields;
    public RetentionPolicyAssignment withFilterFields(RetentionPolicyAssignmentFilterFields[] filterFields) {
        this.filterFields = filterFields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public RetentionPolicyAssignment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_policy")
    public RetentionPolicyMini retentionPolicy;
    public RetentionPolicyAssignment withRetentionPolicy(RetentionPolicyMini retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date_field")
    public String startDateField;
    public RetentionPolicyAssignment withStartDateField(String startDateField) {
        this.startDateField = startDateField;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public RetentionPolicyAssignmentTypeEnum type;
    public RetentionPolicyAssignment withType(RetentionPolicyAssignmentTypeEnum type) {
        this.type = type;
        return this;
    }
}