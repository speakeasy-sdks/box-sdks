package .models.operations;



public class GetUsersIdEmailAliasesRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersIdEmailAliasesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersIdEmailAliasesPathParams pathParams;
    public GetUsersIdEmailAliasesRequest withPathParams(GetUsersIdEmailAliasesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}