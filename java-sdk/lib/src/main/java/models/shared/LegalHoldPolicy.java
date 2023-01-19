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
 * LegalHoldPolicy
 * A mini legal hold policy
**/
public class LegalHoldPolicy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assignment_counts")
    public LegalHoldPolicyAssignmentCounts assignmentCounts;
    public LegalHoldPolicy withAssignmentCounts(LegalHoldPolicyAssignmentCounts assignmentCounts) {
        this.assignmentCounts = assignmentCounts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public LegalHoldPolicy withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public LegalHoldPolicy withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("deleted_at")
    public OffsetDateTime deletedAt;
    public LegalHoldPolicy withDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public LegalHoldPolicy withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("filter_ended_at")
    public OffsetDateTime filterEndedAt;
    public LegalHoldPolicy withFilterEndedAt(OffsetDateTime filterEndedAt) {
        this.filterEndedAt = filterEndedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("filter_started_at")
    public OffsetDateTime filterStartedAt;
    public LegalHoldPolicy withFilterStartedAt(OffsetDateTime filterStartedAt) {
        this.filterStartedAt = filterStartedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public LegalHoldPolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public LegalHoldPolicy withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    public String policyName;
    public LegalHoldPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("release_notes")
    public String releaseNotes;
    public LegalHoldPolicy withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public LegalHoldPolicyStatusEnum status;
    public LegalHoldPolicy withStatus(LegalHoldPolicyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public LegalHoldPolicyTypeEnum type;
    public LegalHoldPolicy withType(LegalHoldPolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}