package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetRetentionPolicyAssignmentsIdFilesUnderRetentionQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
}