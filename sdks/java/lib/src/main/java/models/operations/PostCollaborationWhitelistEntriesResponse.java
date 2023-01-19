package .models.operations;



public class PostCollaborationWhitelistEntriesResponse {
    public .models.shared.ClientError clientError;
    public PostCollaborationWhitelistEntriesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistEntry collaborationAllowlistEntry;
    public PostCollaborationWhitelistEntriesResponse withCollaborationAllowlistEntry(.models.shared.CollaborationAllowlistEntry collaborationAllowlistEntry) {
        this.collaborationAllowlistEntry = collaborationAllowlistEntry;
        return this;
    }
    public String contentType;
    public PostCollaborationWhitelistEntriesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostCollaborationWhitelistEntriesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}