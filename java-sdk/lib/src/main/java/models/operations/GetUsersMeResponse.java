package .models.operations;



public class GetUsersMeResponse {
    public .models.shared.ClientError clientError;
    public GetUsersMeResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersMeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUsersMeResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.User user;
    public GetUsersMeResponse withUser(.models.shared.User user) {
        this.user = user;
        return this;
    }
}