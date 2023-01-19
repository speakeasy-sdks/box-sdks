package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollaborationsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetCollaborationsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}