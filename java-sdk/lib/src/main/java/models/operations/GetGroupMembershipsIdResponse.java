package .models.operations;



public class GetGroupMembershipsIdResponse {
    public .models.shared.ClientError clientError;
    public GetGroupMembershipsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetGroupMembershipsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GroupMembership groupMembership;
    public GetGroupMembershipsIdResponse withGroupMembership(.models.shared.GroupMembership groupMembership) {
        this.groupMembership = groupMembership;
        return this;
    }
    public Long statusCode;
    public GetGroupMembershipsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}