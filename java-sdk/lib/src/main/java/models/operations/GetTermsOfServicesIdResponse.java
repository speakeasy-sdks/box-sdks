package .models.operations;



public class GetTermsOfServicesIdResponse {
    public .models.shared.ClientError clientError;
    public GetTermsOfServicesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTermsOfServicesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTermsOfServicesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfService termsOfService;
    public GetTermsOfServicesIdResponse withTermsOfService(.models.shared.TermsOfService termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }
}