package .models.operations;



public class GetCollectionsIdItemsResponse {
    public .models.shared.ClientError clientError;
    public GetCollectionsIdItemsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetCollectionsIdItemsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Items items;
    public GetCollectionsIdItemsResponse withItems(.models.shared.Items items) {
        this.items = items;
        return this;
    }
    public Long statusCode;
    public GetCollectionsIdItemsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}