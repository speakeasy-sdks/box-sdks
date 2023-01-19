package .models.operations;



public class DeleteUsersIdEmailAliasesIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteUsersIdEmailAliasesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteUsersIdEmailAliasesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteUsersIdEmailAliasesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}