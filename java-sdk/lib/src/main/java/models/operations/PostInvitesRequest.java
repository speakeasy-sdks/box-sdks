package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostInvitesRequest {
    public .models.utils.RetryConfig retries;
    public PostInvitesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostInvitesQueryParams queryParams;
    public PostInvitesRequest withQueryParams(PostInvitesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostInvitesRequestBody request;
    public PostInvitesRequest withRequest(PostInvitesRequestBody request) {
        this.request = request;
        return this;
    }
}