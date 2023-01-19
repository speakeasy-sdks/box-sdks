package .models.operations;



public class DeleteUsersIdAvatarResponse {
    public .models.shared.ClientError clientError;
    public DeleteUsersIdAvatarResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteUsersIdAvatarResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteUsersIdAvatarResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}