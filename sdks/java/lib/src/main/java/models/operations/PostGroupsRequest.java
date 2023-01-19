package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostGroupsRequest {
    public .models.utils.RetryConfig retries;
    public PostGroupsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostGroupsQueryParams queryParams;
    public PostGroupsRequest withQueryParams(PostGroupsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostGroupsRequestBody request;
    public PostGroupsRequest withRequest(PostGroupsRequestBody request) {
        this.request = request;
        return this;
    }
}