package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollaborationWhitelistEntriesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetCollaborationWhitelistEntriesQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetCollaborationWhitelistEntriesQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}