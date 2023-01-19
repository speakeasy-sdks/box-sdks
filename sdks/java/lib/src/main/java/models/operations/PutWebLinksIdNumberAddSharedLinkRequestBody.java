package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutWebLinksIdNumberAddSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink sharedLink;
    public PutWebLinksIdNumberAddSharedLinkRequestBody withSharedLink(PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}