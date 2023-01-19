package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesContentQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFilesContentQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}