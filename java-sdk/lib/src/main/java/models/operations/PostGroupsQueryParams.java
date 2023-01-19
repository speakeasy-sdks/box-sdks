package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostGroupsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostGroupsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}