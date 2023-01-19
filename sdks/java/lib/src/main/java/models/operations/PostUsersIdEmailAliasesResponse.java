package .models.operations;



public class PostUsersIdEmailAliasesResponse {
    public .models.shared.ClientError clientError;
    public PostUsersIdEmailAliasesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostUsersIdEmailAliasesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.EmailAlias emailAlias;
    public PostUsersIdEmailAliasesResponse withEmailAlias(.models.shared.EmailAlias emailAlias) {
        this.emailAlias = emailAlias;
        return this;
    }
    public Long statusCode;
    public PostUsersIdEmailAliasesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}