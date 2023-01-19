package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}