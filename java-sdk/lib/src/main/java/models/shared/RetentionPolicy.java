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
 * RetentionPolicy
 * A base representation of a retention policy.
**/
public class RetentionPolicy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_owners_notified")
    public Boolean areOwnersNotified;
    public RetentionPolicy withAreOwnersNotified(Boolean areOwnersNotified) {
        this.areOwnersNotified = areOwnersNotified;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assignment_counts")
    public RetentionPolicyAssignmentCounts assignmentCounts;
    public RetentionPolicy withAssignmentCounts(RetentionPolicyAssignmentCounts assignmentCounts) {
        this.assignmentCounts = assignmentCounts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_owner_extend_retention")
    public Boolean canOwnerExtendRetention;
    public RetentionPolicy withCanOwnerExtendRetention(Boolean canOwnerExtendRetention) {
        this.canOwnerExtendRetention = canOwnerExtendRetention;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public RetentionPolicy withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserMini createdBy;
    public RetentionPolicy withCreatedBy(UserMini createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_notification_recipients")
    public UserMini[] customNotificationRecipients;
    public RetentionPolicy withCustomNotificationRecipients(UserMini[] customNotificationRecipients) {
        this.customNotificationRecipients = customNotificationRecipients;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public RetentionPolicy withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disposition_action")
    public RetentionPolicyDispositionActionEnum dispositionAction;
    public RetentionPolicy withDispositionAction(RetentionPolicyDispositionActionEnum dispositionAction) {
        this.dispositionAction = dispositionAction;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public RetentionPolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public RetentionPolicy withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    public String policyName;
    public RetentionPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_type")
    public RetentionPolicyPolicyTypeEnum policyType;
    public RetentionPolicy withPolicyType(RetentionPolicyPolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_length")
    public String retentionLength;
    public RetentionPolicy withRetentionLength(String retentionLength) {
        this.retentionLength = retentionLength;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_type")
    public RetentionPolicyRetentionTypeEnum retentionType;
    public RetentionPolicy withRetentionType(RetentionPolicyRetentionTypeEnum retentionType) {
        this.retentionType = retentionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public RetentionPolicyStatusEnum status;
    public RetentionPolicy withStatus(RetentionPolicyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonProperty("type")
    public RetentionPolicyTypeEnum type;
    public RetentionPolicy withType(RetentionPolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}