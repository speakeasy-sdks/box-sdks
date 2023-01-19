package .models.operations;



public class PutUsersIdResponse {
    public .models.shared.ClientError clientError;
    public PutUsersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutUsersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutUsersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.User user;
    public PutUsersIdResponse withUser(.models.shared.User user) {
        this.user = user;
        return this;
    }
}