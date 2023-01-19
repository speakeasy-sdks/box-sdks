package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicyAssignment
 * The assignment of a storage policy to a user or enterprise
**/
public class StoragePolicyAssignment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assigned_to")
    public StoragePolicyAssignmentReference assignedTo;
    public StoragePolicyAssignment withAssignedTo(StoragePolicyAssignmentReference assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage_policy")
    public StoragePolicyMini storagePolicy;
    public StoragePolicyAssignment withStoragePolicy(StoragePolicyMini storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
}