package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCollaborationWhitelistEntriesRequest {
    public .models.utils.RetryConfig retries;
    public PostCollaborationWhitelistEntriesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostCollaborationWhitelistEntriesRequestBody request;
    public PostCollaborationWhitelistEntriesRequest withRequest(PostCollaborationWhitelistEntriesRequestBody request) {
        this.request = request;
        return this;
    }
}