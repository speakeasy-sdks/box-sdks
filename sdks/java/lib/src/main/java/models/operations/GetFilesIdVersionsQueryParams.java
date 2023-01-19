package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdVersionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdVersionsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFilesIdVersionsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetFilesIdVersionsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}