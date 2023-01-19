package .models.operations;



public class GetCollaborationWhitelistEntriesResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationWhitelistEntriesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistEntries collaborationAllowlistEntries;
    public GetCollaborationWhitelistEntriesResponse withCollaborationAllowlistEntries(.models.shared.CollaborationAllowlistEntries collaborationAllowlistEntries) {
        this.collaborationAllowlistEntries = collaborationAllowlistEntries;
        return this;
    }
    public String contentType;
    public GetCollaborationWhitelistEntriesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationWhitelistEntriesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}