package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostStoragePolicyAssignmentsRequestBodyStoragePolicy
 * The storage policy to assign to the user or
 * enterprise
**/
public class PostStoragePolicyAssignmentsRequestBodyStoragePolicy {
    @JsonProperty("id")
    public String id;
    public PostStoragePolicyAssignmentsRequestBodyStoragePolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum type;
    public PostStoragePolicyAssignmentsRequestBodyStoragePolicy withType(PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}