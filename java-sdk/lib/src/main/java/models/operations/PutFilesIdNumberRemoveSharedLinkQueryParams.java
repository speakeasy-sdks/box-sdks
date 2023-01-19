package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberRemoveSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFilesIdNumberRemoveSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}