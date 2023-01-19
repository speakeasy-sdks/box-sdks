package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment
 * The `type` and `id` of the
 * requested shield information barrier segment.
**/
public class ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum type;
    public ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment withType(ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}