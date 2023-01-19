package .models.operations;



public class GetGroupsResponse {
    public .models.shared.ClientError clientError;
    public GetGroupsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetGroupsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Groups groups;
    public GetGroupsResponse withGroups(.models.shared.Groups groups) {
        this.groups = groups;
        return this;
    }
    public Long statusCode;
    public GetGroupsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}