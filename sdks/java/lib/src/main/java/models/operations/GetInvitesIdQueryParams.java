package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetInvitesIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetInvitesIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}