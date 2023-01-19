package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberUpdateSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutWebLinksIdNumberUpdateSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}