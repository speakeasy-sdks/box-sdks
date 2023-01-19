package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFoldersIdNumberAddSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink sharedLink;
    public PutFoldersIdNumberAddSharedLinkRequestBody withSharedLink(PutFoldersIdNumberAddSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}