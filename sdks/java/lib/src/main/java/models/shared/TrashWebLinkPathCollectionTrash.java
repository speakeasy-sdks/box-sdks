package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashWebLinkPathCollectionTrash
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
public class TrashWebLinkPathCollectionTrash {
    @JsonProperty("entries")
    public TrashWebLinkPathCollectionTrashEntries[] entries;
    public TrashWebLinkPathCollectionTrash withEntries(TrashWebLinkPathCollectionTrashEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashWebLinkPathCollectionTrash withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}