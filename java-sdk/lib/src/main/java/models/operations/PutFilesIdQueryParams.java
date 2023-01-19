package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutFilesIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}