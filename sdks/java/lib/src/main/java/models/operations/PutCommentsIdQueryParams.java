package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutCommentsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutCommentsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}