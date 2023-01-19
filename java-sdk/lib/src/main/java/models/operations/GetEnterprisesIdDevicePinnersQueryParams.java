package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetEnterprisesIdDevicePinnersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=direction")
    public GetEnterprisesIdDevicePinnersDirectionEnum direction;
    public GetEnterprisesIdDevicePinnersQueryParams withDirection(GetEnterprisesIdDevicePinnersDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetEnterprisesIdDevicePinnersQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetEnterprisesIdDevicePinnersQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}