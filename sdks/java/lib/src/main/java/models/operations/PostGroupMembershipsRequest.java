package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostGroupMembershipsRequest {
    public .models.utils.RetryConfig retries;
    public PostGroupMembershipsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostGroupMembershipsQueryParams queryParams;
    public PostGroupMembershipsRequest withQueryParams(PostGroupMembershipsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostGroupMembershipsRequestBody request;
    public PostGroupMembershipsRequest withRequest(PostGroupMembershipsRequestBody request) {
        this.request = request;
        return this;
    }
}