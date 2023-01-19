package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EmailAliases
 * A list of email aliases
**/
public class EmailAliases {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public EmailAlias[] entries;
    public EmailAliases withEntries(EmailAlias[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public EmailAliases withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}