package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberRemoveSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutWebLinksIdNumberRemoveSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}