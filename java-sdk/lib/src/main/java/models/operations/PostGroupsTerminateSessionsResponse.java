package .models.operations;



public class PostGroupsTerminateSessionsResponse {
    public .models.shared.ClientError clientError;
    public PostGroupsTerminateSessionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostGroupsTerminateSessionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SessionTerminationMessage sessionTerminationMessage;
    public PostGroupsTerminateSessionsResponse withSessionTerminationMessage(.models.shared.SessionTerminationMessage sessionTerminationMessage) {
        this.sessionTerminationMessage = sessionTerminationMessage;
        return this;
    }
    public Long statusCode;
    public PostGroupsTerminateSessionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}