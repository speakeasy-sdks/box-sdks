package .models.operations;



public class PostGroupsResponse {
    public .models.shared.ClientError clientError;
    public PostGroupsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostGroupsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Group group;
    public PostGroupsResponse withGroup(.models.shared.Group group) {
        this.group = group;
        return this;
    }
    public Long statusCode;
    public PostGroupsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}