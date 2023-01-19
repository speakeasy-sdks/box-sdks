package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RetentionPolicyMini
 * A base representation of a retention policy.
**/
public class RetentionPolicyMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disposition_action")
    public RetentionPolicyMiniDispositionActionEnum dispositionAction;
    public RetentionPolicyMini withDispositionAction(RetentionPolicyMiniDispositionActionEnum dispositionAction) {
        this.dispositionAction = dispositionAction;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public RetentionPolicyMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    public String policyName;
    public RetentionPolicyMini withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_length")
    public String retentionLength;
    public RetentionPolicyMini withRetentionLength(String retentionLength) {
        this.retentionLength = retentionLength;
        return this;
    }
    @JsonProperty("type")
    public RetentionPolicyMiniTypeEnum type;
    public RetentionPolicyMini withType(RetentionPolicyMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}