package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetStoragePolicyAssignmentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetStoragePolicyAssignmentsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=resolved_for_id")
    public String resolvedForId;
    public GetStoragePolicyAssignmentsQueryParams withResolvedForId(String resolvedForId) {
        this.resolvedForId = resolvedForId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=resolved_for_type")
    public GetStoragePolicyAssignmentsResolvedForTypeEnum resolvedForType;
    public GetStoragePolicyAssignmentsQueryParams withResolvedForType(GetStoragePolicyAssignmentsResolvedForTypeEnum resolvedForType) {
        this.resolvedForType = resolvedForType;
        return this;
    }
}