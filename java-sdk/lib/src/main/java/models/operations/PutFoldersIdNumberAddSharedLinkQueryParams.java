package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberAddSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public PutFoldersIdNumberAddSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}