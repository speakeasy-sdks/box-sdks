package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostGroupMembershipsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostGroupMembershipsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}