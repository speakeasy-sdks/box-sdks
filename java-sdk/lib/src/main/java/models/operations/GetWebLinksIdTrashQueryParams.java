package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdTrashQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetWebLinksIdTrashQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}