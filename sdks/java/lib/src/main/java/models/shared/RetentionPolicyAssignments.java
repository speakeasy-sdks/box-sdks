package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RetentionPolicyAssignments
 * The part of an API response that describes marker
 * based pagination
**/
public class RetentionPolicyAssignments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public RetentionPolicyAssignmentBase[] entries;
    public RetentionPolicyAssignments withEntries(RetentionPolicyAssignmentBase[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public RetentionPolicyAssignments withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public RetentionPolicyAssignments withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}