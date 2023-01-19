package .models.operations;



public class PostUsersTerminateSessionsResponse {
    public .models.shared.ClientError clientError;
    public PostUsersTerminateSessionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostUsersTerminateSessionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SessionTerminationMessage sessionTerminationMessage;
    public PostUsersTerminateSessionsResponse withSessionTerminationMessage(.models.shared.SessionTerminationMessage sessionTerminationMessage) {
        this.sessionTerminationMessage = sessionTerminationMessage;
        return this;
    }
    public Long statusCode;
    public PostUsersTerminateSessionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}