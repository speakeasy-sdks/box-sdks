package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostStoragePolicyAssignmentsRequestBodyAssignedTo
 * The user or enterprise to assign the storage
 * policy to.
**/
public class PostStoragePolicyAssignmentsRequestBodyAssignedTo {
    @JsonProperty("id")
    public String id;
    public PostStoragePolicyAssignmentsRequestBodyAssignedTo withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum type;
    public PostStoragePolicyAssignmentsRequestBodyAssignedTo withType(PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum type) {
        this.type = type;
        return this;
    }
}