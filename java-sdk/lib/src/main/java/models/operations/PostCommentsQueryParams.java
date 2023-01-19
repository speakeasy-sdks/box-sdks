package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCommentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostCommentsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}