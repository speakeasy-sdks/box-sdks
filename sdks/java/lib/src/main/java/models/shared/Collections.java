package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Collections
 * The part of an API response that describes pagination
**/
public class Collections {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Collection[] entries;
    public Collections withEntries(Collection[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Collections withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public Collections withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public CollectionsOrder[] order;
    public Collections withOrder(CollectionsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Collections withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}