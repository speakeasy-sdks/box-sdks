package .models.operations;



public class GetGroupsIdCollaborationsResponse {
    public .models.shared.ClientError clientError;
    public GetGroupsIdCollaborationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaborations collaborations;
    public GetGroupsIdCollaborationsResponse withCollaborations(.models.shared.Collaborations collaborations) {
        this.collaborations = collaborations;
        return this;
    }
    public String contentType;
    public GetGroupsIdCollaborationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetGroupsIdCollaborationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}