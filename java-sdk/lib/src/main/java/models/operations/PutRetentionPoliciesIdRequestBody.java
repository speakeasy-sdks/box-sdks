package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutRetentionPoliciesIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_owners_notified")
    public Boolean areOwnersNotified;
    public PutRetentionPoliciesIdRequestBody withAreOwnersNotified(Boolean areOwnersNotified) {
        this.areOwnersNotified = areOwnersNotified;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_owner_extend_retention")
    public Boolean canOwnerExtendRetention;
    public PutRetentionPoliciesIdRequestBody withCanOwnerExtendRetention(Boolean canOwnerExtendRetention) {
        this.canOwnerExtendRetention = canOwnerExtendRetention;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_notification_recipients")
    public .models.shared.UserMini[] customNotificationRecipients;
    public PutRetentionPoliciesIdRequestBody withCustomNotificationRecipients(.models.shared.UserMini[] customNotificationRecipients) {
        this.customNotificationRecipients = customNotificationRecipients;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutRetentionPoliciesIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disposition_action")
    public PutRetentionPoliciesIdRequestBodyDispositionActionEnum dispositionAction;
    public PutRetentionPoliciesIdRequestBody withDispositionAction(PutRetentionPoliciesIdRequestBodyDispositionActionEnum dispositionAction) {
        this.dispositionAction = dispositionAction;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    public String policyName;
    public PutRetentionPoliciesIdRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_length")
    public String retentionLength;
    public PutRetentionPoliciesIdRequestBody withRetentionLength(String retentionLength) {
        this.retentionLength = retentionLength;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_type")
    public String retentionType;
    public PutRetentionPoliciesIdRequestBody withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public PutRetentionPoliciesIdRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }
}