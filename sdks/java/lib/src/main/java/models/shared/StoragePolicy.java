package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicy
 * A mini description of a Storage Policy object
**/
public class StoragePolicy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public StoragePolicy withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public StoragePolicy withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public StoragePolicyTypeEnum type;
    public StoragePolicy withType(StoragePolicyTypeEnum type) {
        this.type = type;
        return this;
    }
}