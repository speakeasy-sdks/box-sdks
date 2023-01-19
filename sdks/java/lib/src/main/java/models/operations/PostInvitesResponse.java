package .models.operations;



public class PostInvitesResponse {
    public .models.shared.ClientError clientError;
    public PostInvitesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostInvitesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Invite invite;
    public PostInvitesResponse withInvite(.models.shared.Invite invite) {
        this.invite = invite;
        return this;
    }
    public Long statusCode;
    public PostInvitesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}