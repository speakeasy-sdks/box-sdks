package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TermsOfServiceUserStatuses
 * A list of terms of service user statuses
**/
public class TermsOfServiceUserStatuses {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public TermsOfServiceUserStatus[] entries;
    public TermsOfServiceUserStatuses withEntries(TermsOfServiceUserStatus[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public TermsOfServiceUserStatuses withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}