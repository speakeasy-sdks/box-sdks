package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashWebLinkRestoredPathCollection
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
public class TrashWebLinkRestoredPathCollection {
    @JsonProperty("entries")
    public FolderMini[] entries;
    public TrashWebLinkRestoredPathCollection withEntries(FolderMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashWebLinkRestoredPathCollection withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}