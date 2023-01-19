package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostStoragePolicyAssignmentsRequestBody {
    @JsonProperty("assigned_to")
    public PostStoragePolicyAssignmentsRequestBodyAssignedTo assignedTo;
    public PostStoragePolicyAssignmentsRequestBody withAssignedTo(PostStoragePolicyAssignmentsRequestBodyAssignedTo assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    @JsonProperty("storage_policy")
    public PostStoragePolicyAssignmentsRequestBodyStoragePolicy storagePolicy;
    public PostStoragePolicyAssignmentsRequestBody withStoragePolicy(PostStoragePolicyAssignmentsRequestBodyStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
}