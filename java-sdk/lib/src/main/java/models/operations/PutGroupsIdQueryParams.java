package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutGroupsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutGroupsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}