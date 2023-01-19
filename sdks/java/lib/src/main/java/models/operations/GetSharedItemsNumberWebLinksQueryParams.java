package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSharedItemsNumberWebLinksQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetSharedItemsNumberWebLinksQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}