package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy
 * The storage policy to assign to the user or
 * enterprise
**/
public class PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy {
    @JsonProperty("id")
    public String id;
    public PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PutStoragePolicyAssignmentsIdRequestBodyStoragePolicyTypeEnum type;
    public PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy withType(PutStoragePolicyAssignmentsIdRequestBodyStoragePolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}