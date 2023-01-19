package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierSegmentRestrictionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shield_information_barrier_segment_restriction_id")
    public String shieldInformationBarrierSegmentRestrictionId;
    public GetShieldInformationBarrierSegmentRestrictionsIdPathParams withShieldInformationBarrierSegmentRestrictionId(String shieldInformationBarrierSegmentRestrictionId) {
        this.shieldInformationBarrierSegmentRestrictionId = shieldInformationBarrierSegmentRestrictionId;
        return this;
    }
}