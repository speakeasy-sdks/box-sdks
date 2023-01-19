package .models.operations;



public class GetStoragePolicyAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public GetStoragePolicyAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetStoragePolicyAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetStoragePolicyAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicyAssignments storagePolicyAssignments;
    public GetStoragePolicyAssignmentsResponse withStoragePolicyAssignments(.models.shared.StoragePolicyAssignments storagePolicyAssignments) {
        this.storagePolicyAssignments = storagePolicyAssignments;
        return this;
    }
}