package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdCollaborationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdCollaborationsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFilesIdCollaborationsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetFilesIdCollaborationsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}