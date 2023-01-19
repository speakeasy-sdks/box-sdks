package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebLinkPathCollection
 * The tree of folders that this web link is contained in,
 * starting at the root.
**/
public class WebLinkPathCollection {
    @JsonProperty("entries")
    public FolderMini[] entries;
    public WebLinkPathCollection withEntries(FolderMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("total_count")
    public Long totalCount;
    public WebLinkPathCollection withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}