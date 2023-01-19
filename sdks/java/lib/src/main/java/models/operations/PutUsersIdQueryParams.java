package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutUsersIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}