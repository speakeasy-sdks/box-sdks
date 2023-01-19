package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment
 * The `type` and `id` of the requested
 * shield information barrier segment.
**/
public class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum type;
    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment withType(ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}