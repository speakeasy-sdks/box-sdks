package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashFileRestoredPathCollection
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
public class TrashFileRestoredPathCollection {
    @JsonProperty("entries")
    public FolderMini[] entries;
    public TrashFileRestoredPathCollection withEntries(FolderMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashFileRestoredPathCollection withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}