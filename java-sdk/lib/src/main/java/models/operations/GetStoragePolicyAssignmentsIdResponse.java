package .models.operations;



public class GetStoragePolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetStoragePolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetStoragePolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetStoragePolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicyAssignment storagePolicyAssignment;
    public GetStoragePolicyAssignmentsIdResponse withStoragePolicyAssignment(.models.shared.StoragePolicyAssignment storagePolicyAssignment) {
        this.storagePolicyAssignment = storagePolicyAssignment;
        return this;
    }
}