package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdNumberGetSharedLinkQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String fields;
    public GetFilesIdNumberGetSharedLinkQueryParams withFields(String fields) {
        this.fields = fields;
        return this;
    }
}