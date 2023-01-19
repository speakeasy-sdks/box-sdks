package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdVersionsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdVersionsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}