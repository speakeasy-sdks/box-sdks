package .models.operations;



public class PutGroupMembershipsIdResponse {
    public .models.shared.ClientError clientError;
    public PutGroupMembershipsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutGroupMembershipsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GroupMembership groupMembership;
    public PutGroupMembershipsIdResponse withGroupMembership(.models.shared.GroupMembership groupMembership) {
        this.groupMembership = groupMembership;
        return this;
    }
    public Long statusCode;
    public PutGroupMembershipsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}