package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdTrashQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFilesIdTrashQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}