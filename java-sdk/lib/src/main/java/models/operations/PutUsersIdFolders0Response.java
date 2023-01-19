package .models.operations;



public class PutUsersIdFolders0Response {
    public .models.shared.ClientError clientError;
    public PutUsersIdFolders0Response withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutUsersIdFolders0Response withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PutUsersIdFolders0Response withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PutUsersIdFolders0Response withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}