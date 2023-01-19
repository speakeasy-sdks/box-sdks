package .models.operations;



public class PutStoragePolicyAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public PutStoragePolicyAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutStoragePolicyAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutStoragePolicyAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.StoragePolicyAssignment storagePolicyAssignment;
    public PutStoragePolicyAssignmentsIdResponse withStoragePolicyAssignment(.models.shared.StoragePolicyAssignment storagePolicyAssignment) {
        this.storagePolicyAssignment = storagePolicyAssignment;
        return this;
    }
}