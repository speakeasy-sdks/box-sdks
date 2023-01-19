package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCollaborationWhitelistExemptTargetsRequest {
    public .models.utils.RetryConfig retries;
    public PostCollaborationWhitelistExemptTargetsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostCollaborationWhitelistExemptTargetsRequestBody request;
    public PostCollaborationWhitelistExemptTargetsRequest withRequest(PostCollaborationWhitelistExemptTargetsRequestBody request) {
        this.request = request;
        return this;
    }
}