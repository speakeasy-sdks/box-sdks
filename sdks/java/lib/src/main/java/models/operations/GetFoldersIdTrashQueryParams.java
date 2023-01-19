package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdTrashQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFoldersIdTrashQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}