package .models.operations;



public class PostTermsOfServiceUserStatusesResponse {
    public .models.shared.ClientError clientError;
    public PostTermsOfServiceUserStatusesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostTermsOfServiceUserStatusesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostTermsOfServiceUserStatusesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TermsOfServiceUserStatus termsOfServiceUserStatus;
    public PostTermsOfServiceUserStatusesResponse withTermsOfServiceUserStatus(.models.shared.TermsOfServiceUserStatus termsOfServiceUserStatus) {
        this.termsOfServiceUserStatus = termsOfServiceUserStatus;
        return this;
    }
}