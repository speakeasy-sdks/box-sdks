package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSharedItemsNumberFoldersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetSharedItemsNumberFoldersQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}