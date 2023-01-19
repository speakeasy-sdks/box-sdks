package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdNumberGetSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public GetWebLinksIdNumberGetSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}