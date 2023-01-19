package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetGroupMembershipsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetGroupMembershipsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}