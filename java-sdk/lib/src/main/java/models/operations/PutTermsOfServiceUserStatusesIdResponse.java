package .models.operations;



public class PutTermsOfServiceUserStatusesIdResponse {
    public .models.shared.ClientError clientError;
    public PutTermsOfServiceUserStatusesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutTermsOfServiceUserStatusesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutTermsOfServiceUserStatusesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfServiceUserStatus termsOfServiceUserStatus;
    public PutTermsOfServiceUserStatusesIdResponse withTermsOfServiceUserStatus(.models.shared.TermsOfServiceUserStatus termsOfServiceUserStatus) {
        this.termsOfServiceUserStatus = termsOfServiceUserStatus;
        return this;
    }
}