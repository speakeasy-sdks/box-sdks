package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostMetadataCascadePoliciesIdApplyRequestBody {
    @JsonProperty("conflict_resolution")
    public PostMetadataCascadePoliciesIdApplyRequestBodyConflictResolutionEnum conflictResolution;
    public PostMetadataCascadePoliciesIdApplyRequestBody withConflictResolution(PostMetadataCascadePoliciesIdApplyRequestBodyConflictResolutionEnum conflictResolution) {
        this.conflictResolution = conflictResolution;
        return this;
    }
}