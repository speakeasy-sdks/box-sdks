package .models.operations;



public class PostStoragePolicyAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public PostStoragePolicyAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostStoragePolicyAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostStoragePolicyAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicyAssignment storagePolicyAssignment;
    public PostStoragePolicyAssignmentsResponse withStoragePolicyAssignment(.models.shared.StoragePolicyAssignment storagePolicyAssignment) {
        this.storagePolicyAssignment = storagePolicyAssignment;
        return this;
    }
}