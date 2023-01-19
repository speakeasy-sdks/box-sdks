package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileVersions
 * The part of an API response that describes pagination
**/
public class FileVersions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public FileVersion[] entries;
    public FileVersions withEntries(FileVersion[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public FileVersions withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public FileVersions withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public FileVersionsOrder[] order;
    public FileVersions withOrder(FileVersionsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public FileVersions withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}