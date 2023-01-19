package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierBase
 * A base representation of a
 * shield information barrier object
**/
public class ShieldInformationBarrierBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierBaseTypeEnum type;
    public ShieldInformationBarrierBase withType(ShieldInformationBarrierBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}