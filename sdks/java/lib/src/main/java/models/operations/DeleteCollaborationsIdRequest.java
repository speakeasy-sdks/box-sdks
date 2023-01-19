package .models.operations;



public class DeleteCollaborationsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteCollaborationsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteCollaborationsIdPathParams pathParams;
    public DeleteCollaborationsIdRequest withPathParams(DeleteCollaborationsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}