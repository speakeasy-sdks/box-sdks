package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesUploadSessionsIdPartsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFilesUploadSessionsIdPartsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetFilesUploadSessionsIdPartsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}