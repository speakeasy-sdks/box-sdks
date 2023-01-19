package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFoldersIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}