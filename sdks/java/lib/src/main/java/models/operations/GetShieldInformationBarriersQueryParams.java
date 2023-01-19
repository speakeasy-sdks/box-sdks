package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarriersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetShieldInformationBarriersQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetShieldInformationBarriersQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}