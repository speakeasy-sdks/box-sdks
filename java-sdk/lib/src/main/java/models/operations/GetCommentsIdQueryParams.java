package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCommentsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetCommentsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}