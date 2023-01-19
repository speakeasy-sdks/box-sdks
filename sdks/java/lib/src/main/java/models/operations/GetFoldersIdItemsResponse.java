package .models.operations;



public class GetFoldersIdItemsResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdItemsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdItemsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Items items;
    public GetFoldersIdItemsResponse withItems(.models.shared.Items items) {
        this.items = items;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdItemsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}