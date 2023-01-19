package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdMembershipsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetUsersIdMembershipsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetUsersIdMembershipsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}