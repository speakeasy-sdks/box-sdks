package .models.operations;



public class PostGroupMembershipsResponse {
    public .models.shared.ClientError clientError;
    public PostGroupMembershipsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostGroupMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.GroupMembership groupMembership;
    public PostGroupMembershipsResponse withGroupMembership(.models.shared.GroupMembership groupMembership) {
        this.groupMembership = groupMembership;
        return this;
    }
    public Long statusCode;
    public PostGroupMembershipsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}