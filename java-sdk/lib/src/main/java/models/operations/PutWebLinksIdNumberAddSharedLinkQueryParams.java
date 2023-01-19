package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberAddSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutWebLinksIdNumberAddSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}