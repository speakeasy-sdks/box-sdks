package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetGroupsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}