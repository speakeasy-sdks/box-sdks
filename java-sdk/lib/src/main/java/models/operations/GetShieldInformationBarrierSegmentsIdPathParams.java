package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierSegmentsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shield_information_barrier_segment_id")
    public String shieldInformationBarrierSegmentId;
    public GetShieldInformationBarrierSegmentsIdPathParams withShieldInformationBarrierSegmentId(String shieldInformationBarrierSegmentId) {
        this.shieldInformationBarrierSegmentId = shieldInformationBarrierSegmentId;
        return this;
    }
}