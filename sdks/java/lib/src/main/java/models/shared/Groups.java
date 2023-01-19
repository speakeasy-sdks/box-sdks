package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Groups
 * The part of an API response that describes pagination
**/
public class Groups {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public GroupMini[] entries;
    public Groups withEntries(GroupMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Groups withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public Groups withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public GroupsOrder[] order;
    public Groups withOrder(GroupsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public Groups withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}