package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSignRequestsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetSignRequestsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetSignRequestsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}