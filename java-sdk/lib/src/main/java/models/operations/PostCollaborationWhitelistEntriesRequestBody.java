package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCollaborationWhitelistEntriesRequestBody {
    @JsonProperty("direction")
    public PostCollaborationWhitelistEntriesRequestBodyDirectionEnum direction;
    public PostCollaborationWhitelistEntriesRequestBody withDirection(PostCollaborationWhitelistEntriesRequestBodyDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @JsonProperty("domain")
    public String domain;
    public PostCollaborationWhitelistEntriesRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }
}