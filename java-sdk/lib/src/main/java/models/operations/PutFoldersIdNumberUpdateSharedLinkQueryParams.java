package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberUpdateSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFoldersIdNumberUpdateSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}