package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebLinksIdNumberRemoveSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public java.util.Map<String, Object> sharedLink;
    public PutWebLinksIdNumberRemoveSharedLinkRequestBody withSharedLink(java.util.Map<String, Object> sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}