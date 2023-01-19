package .models.operations;



public class GetRecentItemsResponse {
    public .models.shared.ClientError clientError;
    public GetRecentItemsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRecentItemsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RecentItems recentItems;
    public GetRecentItemsResponse withRecentItems(.models.shared.RecentItems recentItems) {
        this.recentItems = recentItems;
        return this;
    }
    public Long statusCode;
    public GetRecentItemsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}