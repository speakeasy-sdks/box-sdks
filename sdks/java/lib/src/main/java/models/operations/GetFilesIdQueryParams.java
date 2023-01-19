package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}