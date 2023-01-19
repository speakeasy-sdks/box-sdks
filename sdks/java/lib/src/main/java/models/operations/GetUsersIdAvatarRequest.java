package .models.operations;



public class GetUsersIdAvatarRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersIdAvatarRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersIdAvatarPathParams pathParams;
    public GetUsersIdAvatarRequest withPathParams(GetUsersIdAvatarPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}