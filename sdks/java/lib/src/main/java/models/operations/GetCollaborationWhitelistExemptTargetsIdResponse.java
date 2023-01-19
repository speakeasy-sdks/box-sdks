package .models.operations;



public class GetCollaborationWhitelistExemptTargetsIdResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationWhitelistExemptTargetsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.CollaborationAllowlistExemptTarget collaborationAllowlistExemptTarget;
    public GetCollaborationWhitelistExemptTargetsIdResponse withCollaborationAllowlistExemptTarget(.models.shared.CollaborationAllowlistExemptTarget collaborationAllowlistExemptTarget) {
        this.collaborationAllowlistExemptTarget = collaborationAllowlistExemptTarget;
        return this;
    }
    public String contentType;
    public GetCollaborationWhitelistExemptTargetsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationWhitelistExemptTargetsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}