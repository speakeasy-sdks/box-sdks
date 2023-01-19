package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierSegmentRestrictionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetShieldInformationBarrierSegmentRestrictionsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetShieldInformationBarrierSegmentRestrictionsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=shield_information_barrier_segment_id")
    public String shieldInformationBarrierSegmentId;
    public GetShieldInformationBarrierSegmentRestrictionsQueryParams withShieldInformationBarrierSegmentId(String shieldInformationBarrierSegmentId) {
        this.shieldInformationBarrierSegmentId = shieldInformationBarrierSegmentId;
        return this;
    }
}