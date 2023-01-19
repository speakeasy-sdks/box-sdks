package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFoldersIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}