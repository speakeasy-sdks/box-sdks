package .models.operations;



public class GetTermsOfServicesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetTermsOfServicesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTermsOfServicesIdPathParams pathParams;
    public GetTermsOfServicesIdRequest withPathParams(GetTermsOfServicesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}