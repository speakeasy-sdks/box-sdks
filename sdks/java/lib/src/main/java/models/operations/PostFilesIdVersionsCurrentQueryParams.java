package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdVersionsCurrentQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostFilesIdVersionsCurrentQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}