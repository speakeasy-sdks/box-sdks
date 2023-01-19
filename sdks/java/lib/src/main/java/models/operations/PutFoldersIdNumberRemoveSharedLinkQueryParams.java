package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberRemoveSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFoldersIdNumberRemoveSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}