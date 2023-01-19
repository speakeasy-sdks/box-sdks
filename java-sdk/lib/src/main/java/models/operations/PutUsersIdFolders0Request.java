package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdFolders0Request {
    public .models.utils.RetryConfig retries;
    public PutUsersIdFolders0Request withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutUsersIdFolders0PathParams pathParams;
    public PutUsersIdFolders0Request withPathParams(PutUsersIdFolders0PathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutUsersIdFolders0QueryParams queryParams;
    public PutUsersIdFolders0Request withQueryParams(PutUsersIdFolders0QueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutUsersIdFolders0RequestBody request;
    public PutUsersIdFolders0Request withRequest(PutUsersIdFolders0RequestBody request) {
        this.request = request;
        return this;
    }
}