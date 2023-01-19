package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PostLegalHoldPoliciesRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostLegalHoldPoliciesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("filter_ended_at")
    public OffsetDateTime filterEndedAt;
    public PostLegalHoldPoliciesRequestBody withFilterEndedAt(OffsetDateTime filterEndedAt) {
        this.filterEndedAt = filterEndedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("filter_started_at")
    public OffsetDateTime filterStartedAt;
    public PostLegalHoldPoliciesRequestBody withFilterStartedAt(OffsetDateTime filterStartedAt) {
        this.filterStartedAt = filterStartedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_ongoing")
    public Boolean isOngoing;
    public PostLegalHoldPoliciesRequestBody withIsOngoing(Boolean isOngoing) {
        this.isOngoing = isOngoing;
        return this;
    }
    @JsonProperty("policy_name")
    public String policyName;
    public PostLegalHoldPoliciesRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
}