package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * GroupMemberships
 * The part of an API response that describes pagination
**/
public class GroupMemberships {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public GroupMembership[] entries;
    public GroupMemberships withEntries(GroupMembership[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public GroupMemberships withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public GroupMemberships withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public GroupMembershipsOrder[] order;
    public GroupMemberships withOrder(GroupMembershipsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public GroupMemberships withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}