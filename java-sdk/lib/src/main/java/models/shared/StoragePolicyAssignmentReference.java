package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicyAssignmentReference
 * The bare basic reference for an object
**/
public class StoragePolicyAssignmentReference {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public StoragePolicyAssignmentReference withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public StoragePolicyAssignmentReference withType(String type) {
        this.type = type;
        return this;
    }
}