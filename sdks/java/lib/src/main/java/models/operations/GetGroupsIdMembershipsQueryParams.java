package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdMembershipsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetGroupsIdMembershipsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetGroupsIdMembershipsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}