package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberUpdateSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFilesIdNumberUpdateSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}