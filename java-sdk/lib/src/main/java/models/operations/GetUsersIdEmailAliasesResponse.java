package .models.operations;



public class GetUsersIdEmailAliasesResponse {
    public .models.shared.ClientError clientError;
    public GetUsersIdEmailAliasesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetUsersIdEmailAliasesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.EmailAliases emailAliases;
    public GetUsersIdEmailAliasesResponse withEmailAliases(.models.shared.EmailAliases emailAliases) {
        this.emailAliases = emailAliases;
        return this;
    }
    public Long statusCode;
    public GetUsersIdEmailAliasesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}