package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteShieldInformationBarrierSegmentMembersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shield_information_barrier_segment_member_id")
    public String shieldInformationBarrierSegmentMemberId;
    public DeleteShieldInformationBarrierSegmentMembersIdPathParams withShieldInformationBarrierSegmentMemberId(String shieldInformationBarrierSegmentMemberId) {
        this.shieldInformationBarrierSegmentMemberId = shieldInformationBarrierSegmentMemberId;
        return this;
    }
}