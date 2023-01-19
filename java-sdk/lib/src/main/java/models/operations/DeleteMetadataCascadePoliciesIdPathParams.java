package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteMetadataCascadePoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadata_cascade_policy_id")
    public String metadataCascadePolicyId;
    public DeleteMetadataCascadePoliciesIdPathParams withMetadataCascadePolicyId(String metadataCascadePolicyId) {
        this.metadataCascadePolicyId = metadataCascadePolicyId;
        return this;
    }
}