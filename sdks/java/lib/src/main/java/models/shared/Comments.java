package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Comments
 * The part of an API response that describes pagination
**/
public class Comments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Comment[] entries;
    public Comments withEntries(Comment[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Comments withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public Comments withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public CommentsOrder[] order;
    public Comments withOrder(CommentsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Comments withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}