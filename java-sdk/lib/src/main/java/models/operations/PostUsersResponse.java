package .models.operations;



public class PostUsersResponse {
    public .models.shared.ClientError clientError;
    public PostUsersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostUsersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.User user;
    public PostUsersResponse withUser(.models.shared.User user) {
        this.user = user;
        return this;
    }
}