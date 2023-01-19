package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFoldersQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}