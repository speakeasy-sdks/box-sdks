package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutLegalHoldPoliciesIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutLegalHoldPoliciesIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    public String policyName;
    public PutLegalHoldPoliciesIdRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("release_notes")
    public String releaseNotes;
    public PutLegalHoldPoliciesIdRequestBody withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }
}