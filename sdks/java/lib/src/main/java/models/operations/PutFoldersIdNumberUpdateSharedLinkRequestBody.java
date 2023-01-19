package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFoldersIdNumberUpdateSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink;
    public PutFoldersIdNumberUpdateSharedLinkRequestBody withSharedLink(PutFoldersIdNumberUpdateSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}