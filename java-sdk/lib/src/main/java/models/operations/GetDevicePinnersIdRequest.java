package .models.operations;



public class GetDevicePinnersIdRequest {
    public .models.utils.RetryConfig retries;
    public GetDevicePinnersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetDevicePinnersIdPathParams pathParams;
    public GetDevicePinnersIdRequest withPathParams(GetDevicePinnersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}