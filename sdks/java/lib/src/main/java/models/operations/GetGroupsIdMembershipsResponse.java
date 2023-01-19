package .models.operations;



public class GetGroupsIdMembershipsResponse {
    public .models.shared.ClientError clientError;
    public GetGroupsIdMembershipsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetGroupsIdMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GroupMemberships groupMemberships;
    public GetGroupsIdMembershipsResponse withGroupMemberships(.models.shared.GroupMemberships groupMemberships) {
        this.groupMemberships = groupMemberships;
        return this;
    }
    public Long statusCode;
    public GetGroupsIdMembershipsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}