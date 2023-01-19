package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierSegmentRestrictionRestrictedSegment
 * The `type` and `id` of the
 * restricted shield information barrier segment.
**/
public class ShieldInformationBarrierSegmentRestrictionRestrictedSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierSegmentRestrictionRestrictedSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum type;
    public ShieldInformationBarrierSegmentRestrictionRestrictedSegment withType(ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}