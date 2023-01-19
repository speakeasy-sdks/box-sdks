package .models.operations;



public class GetFoldersTrashItemsResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersTrashItemsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersTrashItemsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Items items;
    public GetFoldersTrashItemsResponse withItems(.models.shared.Items items) {
        this.items = items;
        return this;
    }
    public Long statusCode;
    public GetFoldersTrashItemsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}