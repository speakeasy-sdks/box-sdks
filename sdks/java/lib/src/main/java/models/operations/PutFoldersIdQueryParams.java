package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutFoldersIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}