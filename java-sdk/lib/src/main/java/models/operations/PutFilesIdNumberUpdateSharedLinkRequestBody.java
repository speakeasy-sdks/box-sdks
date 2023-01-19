package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFilesIdNumberUpdateSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFilesIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink;
    public PutFilesIdNumberUpdateSharedLinkRequestBody withSharedLink(PutFilesIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}