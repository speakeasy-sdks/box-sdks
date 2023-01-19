package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostInvitesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostInvitesQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}