package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataTemplatesGlobalQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetMetadataTemplatesGlobalQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetMetadataTemplatesGlobalQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}