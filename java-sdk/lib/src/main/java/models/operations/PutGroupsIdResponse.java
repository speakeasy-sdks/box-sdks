package .models.operations;



public class PutGroupsIdResponse {
    public .models.shared.ClientError clientError;
    public PutGroupsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutGroupsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Group group;
    public PutGroupsIdResponse withGroup(.models.shared.Group group) {
        this.group = group;
        return this;
    }
    public Long statusCode;
    public PutGroupsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}