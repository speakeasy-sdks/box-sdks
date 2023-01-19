package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrashFilePathCollectionTrash
 * The tree of folders that this file is contained in,
 * starting at the root.
**/
public class TrashFilePathCollectionTrash {
    @JsonProperty("entries")
    public TrashFilePathCollectionTrashEntries[] entries;
    public TrashFilePathCollectionTrash withEntries(TrashFilePathCollectionTrashEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public TrashFilePathCollectionTrash withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}