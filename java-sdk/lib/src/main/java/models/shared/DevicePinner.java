package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DevicePinner
 * Device pins allow enterprises to control what devices can
 * use native Box applications.
**/
public class DevicePinner {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public DevicePinner withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owned_by")
    public UserMini ownedBy;
    public DevicePinner withOwnedBy(UserMini ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product_name")
    public String productName;
    public DevicePinner withProductName(String productName) {
        this.productName = productName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public DevicePinnerTypeEnum type;
    public DevicePinner withType(DevicePinnerTypeEnum type) {
        this.type = type;
        return this;
    }
}