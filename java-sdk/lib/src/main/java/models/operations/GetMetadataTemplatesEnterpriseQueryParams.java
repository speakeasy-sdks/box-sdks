package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataTemplatesEnterpriseQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetMetadataTemplatesEnterpriseQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetMetadataTemplatesEnterpriseQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}