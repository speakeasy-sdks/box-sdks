package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Collaborations
 * The part of an API response that describes pagination
**/
public class Collaborations {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Collaboration[] entries;
    public Collaborations withEntries(Collaboration[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Collaborations withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public Collaborations withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public CollaborationsOrder[] order;
    public Collaborations withOrder(CollaborationsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Collaborations withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}