package .models.operations;



public class GetStoragePoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public GetStoragePoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetStoragePoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetStoragePoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicy storagePolicy;
    public GetStoragePoliciesIdResponse withStoragePolicy(.models.shared.StoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
}