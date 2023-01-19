package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetUsersIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}