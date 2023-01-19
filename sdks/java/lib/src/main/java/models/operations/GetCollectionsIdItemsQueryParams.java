package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollectionsIdItemsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetCollectionsIdItemsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetCollectionsIdItemsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetCollectionsIdItemsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}