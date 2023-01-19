package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutGroupsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutGroupsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutGroupsIdPathParams pathParams;
    public PutGroupsIdRequest withPathParams(PutGroupsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutGroupsIdQueryParams queryParams;
    public PutGroupsIdRequest withQueryParams(PutGroupsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutGroupsIdRequestBody request;
    public PutGroupsIdRequest withRequest(PutGroupsIdRequestBody request) {
        this.request = request;
        return this;
    }
}