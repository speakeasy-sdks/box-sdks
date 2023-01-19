package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FolderPathCollection
 * The tree of folders that this folder is contained in,
 * starting at the root.
**/
public class FolderPathCollection {
    @JsonProperty("entries")
    public FolderMini[] entries;
    public FolderPathCollection withEntries(FolderMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public FolderPathCollection withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}