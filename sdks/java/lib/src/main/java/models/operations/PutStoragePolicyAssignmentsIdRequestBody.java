package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutStoragePolicyAssignmentsIdRequestBody {
    @JsonProperty("storage_policy")
    public PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy storagePolicy;
    public PutStoragePolicyAssignmentsIdRequestBody withStoragePolicy(PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
}