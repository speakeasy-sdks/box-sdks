package .models.operations;



public class GetTermsOfServiceUserStatusesResponse {
    public .models.shared.ClientError clientError;
    public GetTermsOfServiceUserStatusesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTermsOfServiceUserStatusesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTermsOfServiceUserStatusesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfServiceUserStatuses termsOfServiceUserStatuses;
    public GetTermsOfServiceUserStatusesResponse withTermsOfServiceUserStatuses(.models.shared.TermsOfServiceUserStatuses termsOfServiceUserStatuses) {
        this.termsOfServiceUserStatuses = termsOfServiceUserStatuses;
        return this;
    }
}