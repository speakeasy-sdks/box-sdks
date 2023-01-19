package .models.operations;



public class DeleteGroupMembershipsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteGroupMembershipsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteGroupMembershipsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteGroupMembershipsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}