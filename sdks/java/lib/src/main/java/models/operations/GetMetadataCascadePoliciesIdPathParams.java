package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataCascadePoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadata_cascade_policy_id")
    public String metadataCascadePolicyId;
    public GetMetadataCascadePoliciesIdPathParams withMetadataCascadePolicyId(String metadataCascadePolicyId) {
        this.metadataCascadePolicyId = metadataCascadePolicyId;
        return this;
    }
}