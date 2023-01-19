package .models.operations;



public class GetCollectionsResponse {
    public .models.shared.ClientError clientError;
    public GetCollectionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collections collections;
    public GetCollectionsResponse withCollections(.models.shared.Collections collections) {
        this.collections = collections;
        return this;
    }
    public String contentType;
    public GetCollectionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollectionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}