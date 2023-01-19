package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashFolderRestoredPathCollection
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
public class TrashFolderRestoredPathCollection {
    @JsonProperty("entries")
    public FolderMini[] entries;
    public TrashFolderRestoredPathCollection withEntries(FolderMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashFolderRestoredPathCollection withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}