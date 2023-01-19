package .models.operations;



public class DeleteDevicePinnersIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteDevicePinnersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteDevicePinnersIdPathParams pathParams;
    public DeleteDevicePinnersIdRequest withPathParams(DeleteDevicePinnersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}