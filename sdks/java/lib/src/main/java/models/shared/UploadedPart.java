package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadedPart
 * A chunk of a file uploaded as part of
 * an upload session, as returned by some endpoints.
**/
public class UploadedPart {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("part")
    public UploadPart part;
    public UploadedPart withPart(UploadPart part) {
        this.part = part;
        return this;
    }
}