package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdCollaborationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetGroupsIdCollaborationsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetGroupsIdCollaborationsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}