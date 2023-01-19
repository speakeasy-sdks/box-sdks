package .models.operations;



public class DeleteUsersIdAvatarRequest {
    public .models.utils.RetryConfig retries;
    public DeleteUsersIdAvatarRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteUsersIdAvatarPathParams pathParams;
    public DeleteUsersIdAvatarRequest withPathParams(DeleteUsersIdAvatarPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}