package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostShieldInformationBarrierSegmentsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostShieldInformationBarrierSegmentsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostShieldInformationBarrierSegmentsRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("shield_information_barrier")
    public .models.shared.ShieldInformationBarrierBase shieldInformationBarrier;
    public PostShieldInformationBarrierSegmentsRequestBody withShieldInformationBarrier(.models.shared.ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
}