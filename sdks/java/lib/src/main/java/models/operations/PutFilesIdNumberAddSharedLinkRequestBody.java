package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFilesIdNumberAddSharedLinkRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink sharedLink;
    public PutFilesIdNumberAddSharedLinkRequestBody withSharedLink(PutFilesIdNumberAddSharedLinkRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
}