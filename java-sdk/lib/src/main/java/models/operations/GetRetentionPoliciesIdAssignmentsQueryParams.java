package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPoliciesIdAssignmentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetRetentionPoliciesIdAssignmentsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetRetentionPoliciesIdAssignmentsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetRetentionPoliciesIdAssignmentsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public GetRetentionPoliciesIdAssignmentsTypeEnum type;
    public GetRetentionPoliciesIdAssignmentsQueryParams withType(GetRetentionPoliciesIdAssignmentsTypeEnum type) {
        this.type = type;
        return this;
    }
}