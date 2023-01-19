package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersIdEmailAliasesRequest {
    public .models.utils.RetryConfig retries;
    public PostUsersIdEmailAliasesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostUsersIdEmailAliasesPathParams pathParams;
    public PostUsersIdEmailAliasesRequest withPathParams(PostUsersIdEmailAliasesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostUsersIdEmailAliasesRequestBody request;
    public PostUsersIdEmailAliasesRequest withRequest(PostUsersIdEmailAliasesRequestBody request) {
        this.request = request;
        return this;
    }
}