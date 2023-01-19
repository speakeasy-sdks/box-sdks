package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TermsOfServices
 * A list of terms of services
**/
public class TermsOfServices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public TermsOfService[] entries;
    public TermsOfServices withEntries(TermsOfService[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public TermsOfServices withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}