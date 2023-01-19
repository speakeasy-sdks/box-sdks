package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadPart
 * The basic representation of an upload
 * session chunk.
**/
public class UploadPart {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;
    public UploadPart withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("part_id")
    public String partId;
    public UploadPart withPartId(String partId) {
        this.partId = partId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sha1")
    public String sha1;
    public UploadPart withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public UploadPart withSize(Long size) {
        this.size = size;
        return this;
    }
}