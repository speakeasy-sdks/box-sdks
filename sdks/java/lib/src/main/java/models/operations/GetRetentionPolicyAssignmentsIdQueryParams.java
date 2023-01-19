package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPolicyAssignmentsIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetRetentionPolicyAssignmentsIdQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}