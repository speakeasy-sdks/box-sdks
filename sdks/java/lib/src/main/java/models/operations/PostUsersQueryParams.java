package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostUsersQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}