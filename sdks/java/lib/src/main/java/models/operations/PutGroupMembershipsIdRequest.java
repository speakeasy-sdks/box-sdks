package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutGroupMembershipsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutGroupMembershipsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutGroupMembershipsIdPathParams pathParams;
    public PutGroupMembershipsIdRequest withPathParams(PutGroupMembershipsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutGroupMembershipsIdQueryParams queryParams;
    public PutGroupMembershipsIdRequest withQueryParams(PutGroupMembershipsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutGroupMembershipsIdRequestBody request;
    public PutGroupMembershipsIdRequest withRequest(PutGroupMembershipsIdRequestBody request) {
        this.request = request;
        return this;
    }
}