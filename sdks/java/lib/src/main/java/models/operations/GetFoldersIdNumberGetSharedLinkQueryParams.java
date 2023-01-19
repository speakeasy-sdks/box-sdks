package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdNumberGetSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public GetFoldersIdNumberGetSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}