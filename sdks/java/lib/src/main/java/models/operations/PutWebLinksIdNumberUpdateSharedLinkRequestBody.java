package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebLinksIdNumberUpdateSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBody withSharedLink(PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}