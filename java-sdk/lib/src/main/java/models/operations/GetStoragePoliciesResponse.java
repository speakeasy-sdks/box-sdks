package .models.operations;



public class GetStoragePoliciesResponse {
    public .models.shared.ClientError clientError;
    public GetStoragePoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetStoragePoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetStoragePoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicies storagePolicies;
    public GetStoragePoliciesResponse withStoragePolicies(.models.shared.StoragePolicies storagePolicies) {
        this.storagePolicies = storagePolicies;
        return this;
    }
}