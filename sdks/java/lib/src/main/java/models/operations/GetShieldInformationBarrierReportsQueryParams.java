package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierReportsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetShieldInformationBarrierReportsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetShieldInformationBarrierReportsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=shield_information_barrier_id")
    public String shieldInformationBarrierId;
    public GetShieldInformationBarrierReportsQueryParams withShieldInformationBarrierId(String shieldInformationBarrierId) {
        this.shieldInformationBarrierId = shieldInformationBarrierId;
        return this;
    }
}