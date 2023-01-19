package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFilesIdContentQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}