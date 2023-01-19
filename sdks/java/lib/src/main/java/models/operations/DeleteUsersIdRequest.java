package .models.operations;



public class DeleteUsersIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteUsersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteUsersIdPathParams pathParams;
    public DeleteUsersIdRequest withPathParams(DeleteUsersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteUsersIdQueryParams queryParams;
    public DeleteUsersIdRequest withQueryParams(DeleteUsersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}