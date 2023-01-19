package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSharedItemsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetSharedItemsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}