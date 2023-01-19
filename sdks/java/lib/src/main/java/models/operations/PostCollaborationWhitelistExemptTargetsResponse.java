package .models.operations;



public class PostCollaborationWhitelistExemptTargetsResponse {
    public .models.shared.ClientError clientError;
    public PostCollaborationWhitelistExemptTargetsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistExemptTarget collaborationAllowlistExemptTarget;
    public PostCollaborationWhitelistExemptTargetsResponse withCollaborationAllowlistExemptTarget(.models.shared.CollaborationAllowlistExemptTarget collaborationAllowlistExemptTarget) {
        this.collaborationAllowlistExemptTarget = collaborationAllowlistExemptTarget;
        return this;
    }
    public String contentType;
    public PostCollaborationWhitelistExemptTargetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostCollaborationWhitelistExemptTargetsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}