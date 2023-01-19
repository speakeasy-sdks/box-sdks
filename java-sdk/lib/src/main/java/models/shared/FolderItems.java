package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FolderItems
 * A page of the items that are in the folder.
 * 
 * This field can only be requested when querying a folder's
 * information, not when querying a folder's items.
**/
public class FolderItems {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public Object[] entries;
    public FolderItems withEntries(Object[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public FolderItems withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public FolderItems withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public FolderItemsOrder[] order;
    public FolderItems withOrder(FolderItemsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public FolderItems withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}