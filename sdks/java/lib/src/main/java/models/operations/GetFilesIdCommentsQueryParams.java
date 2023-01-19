package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdCommentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdCommentsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFilesIdCommentsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetFilesIdCommentsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}