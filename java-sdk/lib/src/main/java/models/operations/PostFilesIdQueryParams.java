package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFilesIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}