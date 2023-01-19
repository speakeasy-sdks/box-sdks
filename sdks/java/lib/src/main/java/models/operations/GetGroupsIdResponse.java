package .models.operations;



public class GetGroupsIdResponse {
    public .models.shared.ClientError clientError;
    public GetGroupsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetGroupsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Group group;
    public GetGroupsIdResponse withGroup(.models.shared.Group group) {
        this.group = group;
        return this;
    }
    public Long statusCode;
    public GetGroupsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}