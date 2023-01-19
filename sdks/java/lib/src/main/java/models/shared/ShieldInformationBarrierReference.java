package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierReference
 * A shield information barrier reference for requests and responses
**/
public class ShieldInformationBarrierReference {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier")
    public ShieldInformationBarrierBase shieldInformationBarrier;
    public ShieldInformationBarrierReference withShieldInformationBarrier(ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
}