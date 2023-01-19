package .models.operations;



public class GetInvitesIdResponse {
    public .models.shared.ClientError clientError;
    public GetInvitesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetInvitesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Invite invite;
    public GetInvitesIdResponse withInvite(.models.shared.Invite invite) {
        this.invite = invite;
        return this;
    }
    public Long statusCode;
    public GetInvitesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}