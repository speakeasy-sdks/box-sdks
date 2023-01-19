package .models.operations;



public class GetTermsOfServicesResponse {
    public .models.shared.ClientError clientError;
    public GetTermsOfServicesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTermsOfServicesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTermsOfServicesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfServices termsOfServices;
    public GetTermsOfServicesResponse withTermsOfServices(.models.shared.TermsOfServices termsOfServices) {
        this.termsOfServices = termsOfServices;
        return this;
    }
}