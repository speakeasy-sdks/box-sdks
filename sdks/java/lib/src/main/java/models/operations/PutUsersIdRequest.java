package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdRequest {
    public .models.utils.RetryConfig retries;
    public PutUsersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutUsersIdPathParams pathParams;
    public PutUsersIdRequest withPathParams(PutUsersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutUsersIdQueryParams queryParams;
    public PutUsersIdRequest withQueryParams(PutUsersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutUsersIdRequestBody request;
    public PutUsersIdRequest withRequest(PutUsersIdRequestBody request) {
        this.request = request;
        return this;
    }
}