package .models.operations;



public class GetUsersIdResponse {
    public .models.shared.ClientError clientError;
    public GetUsersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUsersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.User user;
    public GetUsersIdResponse withUser(.models.shared.User user) {
        this.user = user;
        return this;
    }
}