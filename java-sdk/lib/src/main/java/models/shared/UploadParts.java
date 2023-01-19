package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadParts
 * The part of an API response that describes pagination
**/
public class UploadParts {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public UploadPart[] entries;
    public UploadParts withEntries(UploadPart[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public UploadParts withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public UploadParts withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public UploadPartsOrder[] order;
    public UploadParts withOrder(UploadPartsOrder[] order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;
    public UploadParts withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}