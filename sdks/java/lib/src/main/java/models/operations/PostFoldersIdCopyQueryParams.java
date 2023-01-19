package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdCopyQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFoldersIdCopyQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}