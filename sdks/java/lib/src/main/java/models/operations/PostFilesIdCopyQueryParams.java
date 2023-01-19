package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdCopyQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFilesIdCopyQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}