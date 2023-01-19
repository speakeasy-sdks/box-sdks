package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostShieldInformationBarrierSegmentRestrictionsRequestBody {
    @JsonProperty("restricted_segment")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment restrictedSegment;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBody withRestrictedSegment(PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment restrictedSegment) {
        this.restrictedSegment = restrictedSegment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier")
    public .models.shared.ShieldInformationBarrierBase shieldInformationBarrier;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBody withShieldInformationBarrier(.models.shared.ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    @JsonProperty("shield_information_barrier_segment")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBody withShieldInformationBarrierSegment(PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    @JsonProperty("type")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum type;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBody withType(PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum type) {
        this.type = type;
        return this;
    }
}