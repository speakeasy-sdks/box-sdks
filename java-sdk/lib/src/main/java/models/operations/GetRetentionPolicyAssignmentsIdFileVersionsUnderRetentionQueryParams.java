package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetRetentionPolicyAssignmentsIdFileVersionsUnderRetentionQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}