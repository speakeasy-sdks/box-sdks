package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashFolderPathCollectionTrash
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
public class TrashFolderPathCollectionTrash {
    @JsonProperty("entries")
    public TrashFolderPathCollectionTrashEntries[] entries;
    public TrashFolderPathCollectionTrash withEntries(TrashFolderPathCollectionTrashEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashFolderPathCollectionTrash withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}