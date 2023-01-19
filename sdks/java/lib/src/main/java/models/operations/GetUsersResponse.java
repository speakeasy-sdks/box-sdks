package .models.operations;



public class GetUsersResponse {
    public .models.shared.ClientError clientError;
    public GetUsersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUsersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Users users;
    public GetUsersResponse withUsers(.models.shared.Users users) {
        this.users = users;
        return this;
    }
}