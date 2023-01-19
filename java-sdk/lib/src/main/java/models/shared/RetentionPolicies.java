package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RetentionPolicies
 * The part of an API response that describes marker
 * based pagination
**/
public class RetentionPolicies {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public RetentionPolicyMini[] entries;
    public RetentionPolicies withEntries(RetentionPolicyMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public RetentionPolicies withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public RetentionPolicies withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}