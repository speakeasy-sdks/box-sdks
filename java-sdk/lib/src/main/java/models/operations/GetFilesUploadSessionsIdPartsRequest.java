package .models.operations;



public class GetFilesUploadSessionsIdPartsRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesUploadSessionsIdPartsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public GetFilesUploadSessionsIdPartsRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public GetFilesUploadSessionsIdPartsPathParams pathParams;
    public GetFilesUploadSessionsIdPartsRequest withPathParams(GetFilesUploadSessionsIdPartsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesUploadSessionsIdPartsQueryParams queryParams;
    public GetFilesUploadSessionsIdPartsRequest withQueryParams(GetFilesUploadSessionsIdPartsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}