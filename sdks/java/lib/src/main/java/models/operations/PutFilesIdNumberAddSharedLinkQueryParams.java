package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberAddSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFilesIdNumberAddSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}