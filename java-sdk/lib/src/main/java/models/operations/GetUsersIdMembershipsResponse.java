package .models.operations;



public class GetUsersIdMembershipsResponse {
    public .models.shared.ClientError clientError;
    public GetUsersIdMembershipsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersIdMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GroupMemberships groupMemberships;
    public GetUsersIdMembershipsResponse withGroupMemberships(.models.shared.GroupMemberships groupMemberships) {
        this.groupMemberships = groupMemberships;
        return this;
    }
    public Long statusCode;
    public GetUsersIdMembershipsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}