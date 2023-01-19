package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersMeQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetUsersMeQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}