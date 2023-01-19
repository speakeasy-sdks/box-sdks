package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierSegmentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetShieldInformationBarrierSegmentsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetShieldInformationBarrierSegmentsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=shield_information_barrier_id")
    public String shieldInformationBarrierId;
    public GetShieldInformationBarrierSegmentsQueryParams withShieldInformationBarrierId(String shieldInformationBarrierId) {
        this.shieldInformationBarrierId = shieldInformationBarrierId;
        return this;
    }
}