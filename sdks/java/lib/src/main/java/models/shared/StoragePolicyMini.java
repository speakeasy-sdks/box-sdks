package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * StoragePolicyMini
 * A mini description of a Storage Policy object
**/
public class StoragePolicyMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public StoragePolicyMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public StoragePolicyMiniTypeEnum type;
    public StoragePolicyMini withType(StoragePolicyMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}