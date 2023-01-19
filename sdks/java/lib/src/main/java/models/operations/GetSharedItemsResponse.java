package .models.operations;



public class GetSharedItemsResponse {
    public .models.shared.ClientError clientError;
    public GetSharedItemsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetSharedItemsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public GetSharedItemsResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public GetSharedItemsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}