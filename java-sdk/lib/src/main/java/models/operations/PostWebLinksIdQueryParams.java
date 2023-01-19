package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWebLinksIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostWebLinksIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}