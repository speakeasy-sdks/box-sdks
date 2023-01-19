package .models.operations;



public class PutTermsOfServicesIdResponse {
    public .models.shared.ClientError clientError;
    public PutTermsOfServicesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutTermsOfServicesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutTermsOfServicesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfService termsOfService;
    public PutTermsOfServicesIdResponse withTermsOfService(.models.shared.TermsOfService termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }
}