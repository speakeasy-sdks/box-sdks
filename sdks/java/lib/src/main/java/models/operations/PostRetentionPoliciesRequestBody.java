package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostRetentionPoliciesRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_owners_notified")
    public Boolean areOwnersNotified;
    public PostRetentionPoliciesRequestBody withAreOwnersNotified(Boolean areOwnersNotified) {
        this.areOwnersNotified = areOwnersNotified;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_owner_extend_retention")
    public Boolean canOwnerExtendRetention;
    public PostRetentionPoliciesRequestBody withCanOwnerExtendRetention(Boolean canOwnerExtendRetention) {
        this.canOwnerExtendRetention = canOwnerExtendRetention;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_notification_recipients")
    public .models.shared.UserMini[] customNotificationRecipients;
    public PostRetentionPoliciesRequestBody withCustomNotificationRecipients(.models.shared.UserMini[] customNotificationRecipients) {
        this.customNotificationRecipients = customNotificationRecipients;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostRetentionPoliciesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("disposition_action")
    public PostRetentionPoliciesRequestBodyDispositionActionEnum dispositionAction;
    public PostRetentionPoliciesRequestBody withDispositionAction(PostRetentionPoliciesRequestBodyDispositionActionEnum dispositionAction) {
        this.dispositionAction = dispositionAction;
        return this;
    }
    @JsonProperty("policy_name")
    public String policyName;
    public PostRetentionPoliciesRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonProperty("policy_type")
    public PostRetentionPoliciesRequestBodyPolicyTypeEnum policyType;
    public PostRetentionPoliciesRequestBody withPolicyType(PostRetentionPoliciesRequestBodyPolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_length")
    public String retentionLength;
    public PostRetentionPoliciesRequestBody withRetentionLength(String retentionLength) {
        this.retentionLength = retentionLength;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_type")
    public PostRetentionPoliciesRequestBodyRetentionTypeEnum retentionType;
    public PostRetentionPoliciesRequestBody withRetentionType(PostRetentionPoliciesRequestBodyRetentionTypeEnum retentionType) {
        this.retentionType = retentionType;
        return this;
    }
}